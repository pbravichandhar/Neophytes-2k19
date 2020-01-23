const express = require("express");
var app = express();
var upload = require("express-fileupload");
const http = require("http");
http.Server(app).listen(80);

app.use(upload());

console.log("Server Started at port 80");

app.get("/", async(req, res) =>{
  res.sendFile(__dirname + "/index.html");
});
app.post("/", async (req, res) => {
  console.log(req.files);
  if (req.files.upfile || req.files.imagefile) {
    var file =  req.files.upfile;
    var uploadpath = __dirname + "/uploads/" + file.name;
    file.mv(uploadpath, async err => {
      if (err) {
        console.log("File Upload Failed", file.name, err);
        res.send("Error Occured!");
      } else {
        console.log("File Uploaded", file.name);
      }
    });
    var image = req.files.imagefile;
    var uploadimage = __dirname + "/uploads/images/" + image.name;
    image.mv(uploadimage, async err => {
      if (err) {
        console.log("File Upload Failed", image.name, err);
        res.send("Error Occured!");
      } else {
        console.log("File Uploaded image", image.name);
        res.send("Files has been uploaded Successfully");
      }
    });
  } else {
    res.send("No File selected !");
    res.end();
  }
});
