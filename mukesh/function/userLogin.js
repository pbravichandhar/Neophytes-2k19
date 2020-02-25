const router = require('express').Router();
const Post = require('../Schema/userSchema');
const prod = require('../Schema/mobileSchema');
const bcrypt = require('bcryptjs');
const jwt = require('jsonwebtoken');
let cookieParser = require('cookie-parser'); 

router.use(cookieParser()); 

router.post('/signup', async (req, res) => {

    //hashed password
    const salt = await bcrypt.genSalt(10);
    const hashedpassword = await bcrypt.hash(req.body.password, salt);

    // new user entry
    try {
        const post = new Post({
            username: req.body.username,
            password: hashedpassword,
            phonenumber: req.body.phonenumber,
            email: req.body.email,
            isAdmin: req.body.admin

        });

        const usersaved = await post.save();
        res.json(usersaved);
    } catch (error) {
        res.json({ message: error });
    }
});


router.post('/login', async (req, res) => {
    const checkUser = await Post.findOne({ username: req.body.username });
    if (!checkUser) return res.status(400).send('your not a User');
    const checkPassword = await bcrypt.compare(req.body.password, checkUser.password);
    const userDetails = { username: checkUser.username, isAdmin: checkUser.isAdmin };
    const token = jwt.sign(userDetails, process.env.SECRET_TOKEN);

    if (checkPassword) res.cookie("jwtToken",token).status(200).json({ message: "login",token: token });
    else {
        
        res.status(400).json({ message: "worng password try again"});
    }

});
module.exports = router;

