const mongoose = require("mongoose");

const bookschema = mongoose.Schema(
  {
    bookid: {
      type: Number,
      require: true
    },
    bookname: {
      type: String,
      require: true
    },
    author: {
      type: String,
      require: true
    },
    price: {
      type: Number,
      require: true
    }
  },
  {
    collection: "books"
  }
);
module.exports = mongoose.model("posts", bookschema);
