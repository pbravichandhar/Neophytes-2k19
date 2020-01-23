//schema for admin details
const mongoose = require('mongoose');
const userSchema = mongoose.Schema({
    email: {
        type: String,
        require: true,
    },
    secretToken: {
        type: String,
        require: true,
    },
}, {
    collection: 'email'
});

module.exports = mongoose.model('poster', userSchema) //export the userschema module