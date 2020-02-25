const express = require("express");
const mongoose = require("mongoose");
const bodyparser = require("body-parser");
const app = express();
require("dotenv/config");

app.use(bodyparser.json());
const postproduct = require("./router/app");
const postuser = require("./controller/login");
const logout = require("./controller/logout");

app.use("/productentry", postproduct);
app.use("/userentry", postuser);
app.use("/userlogout", logout);

app.get("/", async (req, res) => {
  res.send("---Home Page---");
});

mongoose.connect(
  process.env.DB_CONNECTION,
  { useNewUrlParser: true },
  async () => {
    console.log("DataBase Connected!!");
  }
);

  app.listen(3007, () => {
  console.log("server listening to the port 3007..");
})
