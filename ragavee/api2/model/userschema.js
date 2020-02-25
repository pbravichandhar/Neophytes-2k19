const mongoose = require("mongoose");

const schemaUser = mongoose.Schema(
  {
    username: {
      type: String,
      require: true,
      unique: true
    },
    password: {
      type: String,
      require: true
    },
    email: {
      type: String,
      require: true,
      // unique: true
    },
    phonenumber: {
      type: Number,
      require: true
    },
    isAdmin: {
      type: Boolean,
      default: true
    }
  },
  {
    collection: "User"
  }
);
module.exports = mongoose.model("poster", schemaUser);
