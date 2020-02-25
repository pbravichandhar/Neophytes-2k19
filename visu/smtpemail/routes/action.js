const express = require('express');
const router = express.Router();
const nodemailer = require("nodemailer");
const Bodyparser = require('body-parser');
const urlencoded = Bodyparser.urlencoded({ extended: true })
const User = require('../model/emailschema'); //use Studentschema module
const app = express();
const jwt = require('jsonwebtoken');
const { check, validationResult } = require('express-validator');

var smtpTransport = nodemailer.createTransport({
    service: "Gmail",
    auth: {
        user: "visusekar99@gmail.com",
        pass: "mahimahi23"
    }
});
var mailOptions, host, link;
router.post('/signup', urlencoded, async(req, res) => {
    {
        try {
            const email = req.body.email;

            function validateEmail(email) {
                var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
                return emailPattern.test(email);
            }
            const value = (validateEmail(email));
            if (value) {
                console.log("jii")
                const secretToken = jwt.sign(email, process.env.SECRET_TOKEN);
                const user = new User({ email, secretToken })
                const ret = await user.save();
                res.json(ret);
                host = req.get('host');
                link = "http://" + req.get('host') + "/students/verify?email=" + email + "&id=" + secretToken;
                console.log(secretToken);
                mailOptions = {
                    to: email,
                    subject: "Please confirm your Email account",
                    html: "Hello,<br> Please Click on the link to verify your email.<br><a href=" + link + ">Click here to verify</a>"
                }
                console.log(mailOptions);
                smtpTransport.sendMail(mailOptions, function(error, response) {
                    if (error) {
                        console.log(error);
                        res.send("error");
                    } else {
                        console.log("Message sent:");
                        res.send("sent");
                    }
                });
            }
        } catch (error) {
            console.log(error)
        }
    }

});
router.get('/verify', async(req, res) => {
    const user = await User.findOne({ email: req.query.email });
    const token = user.secretToken;
    console.log(req.protocol + ":/" + req.get('host'));
    if ((req.protocol + "://" + req.get('host')) == ("http://" + host)) {
        console.log("Domain is matched. Information is from Authentic email");
        if (req.query.id == token) {
            console.log("email is verified");
            res.end("<h1>Email " + mailOptions.to + " is been Successfully verified");
        } else {
            console.log("email is not verified");
            res.end("<h1>Bad Request</h1>");
        }
    } else {
        res.end("<h1>Request is from unknown source");
    }
});


module.exports = router; //export the router modules