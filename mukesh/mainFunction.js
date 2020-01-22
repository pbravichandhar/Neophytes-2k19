const express = require('express');
const mongoose = require('mongoose');
const bodyparser = require('body-parser');
const app = express();
require('dotenv/config');


app.use(bodyparser.json());

const mobile = require('./function/mobileFunction');
const admin = require('./function/userLogin');

app.use('/mobile', mobile);
app.use('/user', admin);

mongoose.connect('mongodb://localhost:27018/local', { useNewUrlParser: true }, async () => {
    console.log("the port is 8080 ");
});


app.listen(8080)