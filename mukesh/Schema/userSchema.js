const mongoose = require('mongoose');


const userSchema = mongoose.Schema({
    username: {
        type: String,
        min:3,
        max:100,
        require: true
    },
    password: {
        type: String,
        min:3,
        max:100,
        require: true
    },
    phonenumber: {
        type: Number,
        require: true
    },
    email: {
        type: String,
        require: true
    },
    isAdmin: {
        type: Boolean,
        default: true
    }
},

    {
        collection: 'Users'
    }


);


module.exports = mongoose.model('poster', userSchema);