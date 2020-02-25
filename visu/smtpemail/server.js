//required modules
const express = require('express'); //require express module
const mongoose = require('mongoose'); //require mongoose model
const bodyparser = require('body-parser'); //require bodyparser to parse the input
const port = 8083; //configuring the portno
const app = express();
const url = 'mongodb://localhost:27018/smtp'; //database path
require('dotenv/config');
app.use(bodyparser.json());

const studentrouter = require('./routes/action');
app.use('/students', studentrouter);


//connect the database with the node 
mongoose.connect(url, { useNewUrlParser: true }, async() => {
    console.log("Database Connected");
});
app.listen(port, () => {
    console.log("Started @ " + port)
})