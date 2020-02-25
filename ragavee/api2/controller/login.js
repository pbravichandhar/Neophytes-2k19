const express = require("express");
const router = express.Router();
const Post = require("../model/userschema");
const bcrypt = require("bcryptjs");
const jwt = require("jsonwebtoken");
const nodemailer = require('nodemailer');


router.get("/", async (req, res) => {
  try {
    res.json("---Register---");
  } catch (error) {
    res.json({ message: error });
  }
});

router.post("/signup", async (req, res) => {
  //hashed password
  const salt = await bcrypt.genSalt(4);
  const hashedpassword = await bcrypt.hash(req.body.password, salt);

  try {
    const post = new Post({
      username: req.body.username,
      password: hashedpassword,
      email: req.body.email,
      phonenumber: req.body.phonenumber,
      isAdmin: req.body.isAdmin
    });
    const usersaved = await post.save();
    const transporter = nodemailer.createTransport({
      service: 'gmail',
      auth: {
             user: 'ragavee1998@gmail.com',
             pass: '9952483707'
         }
     });
    
     const mailOptions = {
      from: "ragavee1998@gmail.com",
      to: req.body.email, 
      subject: 'some', 
      html: '<p>hello</p>'
    };
    
    transporter.sendMail(mailOptions, function (err, info) {
      if(err)
        console.log(err)
      else
        console.log(info);
    });
    
    res.json(usersaved);
    sendMail();
  } catch (error) {
    res.json({ message: error });
  }
});

router.post("/login", async (req, res) => {
  //usercheck
  const user = await Post.findOne({ username: req.body.username });
  if (!user) return res.status(400).send("User Does Not Exists");
  //passwordcheck
  const pass = await bcrypt.compare(req.body.password, user.password);
  if (!pass) res.status(400).json({ message: "Password Does Not Match" });
  else {
    const userDetails = { username: user.username, isAdmin: user.isAdmin };
   secretToken = jwt.sign(userDetails, process.env.SECRET_TOKEN);
    res
      .status(200)
      .json({ message: "logged in successfully", token: secretToken });
  }
});

module.exports = router;
