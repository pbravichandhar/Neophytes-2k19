const express = require("express");
const router = express.Router();
const Post = require("../model/productschema");
const jwt = require("jsonwebtoken");
const logout = require("../controller/logout");

const jwtTokenDetails = (req, res, next) => {
  const { authorization } = req.headers;
  jwt.verify(authorization, process.env.SECRET_TOKEN, (err, data) => {
    if (err) res.status(403).json({ message: "cannot modify" });
    console.log(data);
    req.user = data;
  });
  next();
};

router.post("/", jwtTokenDetails, async (req, res) => {
  if (req.user.isAdmin == true && secretToken !=null) {
    try {
      const post = new Post({
        bookid: req.body.bookid,
        bookname: req.body.bookname,
        author: req.body.author,
        price: req.body.price
      });
      const postdetails = await post.save();
      res.json(postdetails);
    } catch (error) {
      res.json({ message: error });
    }
  } else req.status(401).send("Not an Admin");
});

router.get("/", async (req, res) => {
  if(secretToken != null){
  try {
    const gets = await Post.find();
    res.json(gets);
  } catch (error) {
    res.json({ message: error });
  }
}
});

router.delete("/:bookid", jwtTokenDetails, async (req, res) => {
  if (req.user.isAdmin == true && secretToken != null) {
    try {
      const deletes = await Post.remove({ bookid: req.params.bookid });
      res.json(deletes);
    } catch (error) {
      res.json(error);
    }
  } else res.status(401).send("Not an Admin");
});

router.patch("/:bookid", jwtTokenDetails, async (req, res) => {
  if (req.user.isAdmin == true && secretToken != null) {
    try {
      const update = await Post.updateOne(
        { bookid: req.params.bookid },
        { $set: { price: req.body.price } }
      );
      res.json(update);
    } catch (error) {
      res.json(error);
    }
  } else res.status(401).send("Not an Admin");
});

// router.get(
//   "/",
//   new Promise((succes, failure) => {
//     const gets = Post.find();
//     succes(gets);
//     failure(err);
//   })
//     .then(res => {
//       res.json(gets);
//     })
//     .catch(res => {
//       res.json({ message: err });
//     })
// );

module.exports = router;
