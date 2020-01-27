const express = require("express");
const router = express.Router();
const Post = require("../model/userschema");

router.get('/logout', function(req, res) {
    secretToken = null;
    res.send("logged out... "+secretToken);
  });

module.exports = router;
