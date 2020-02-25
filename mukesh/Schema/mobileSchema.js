const mongoose = require('mongoose');

const mobileSchema = mongoose.Schema({
    mobileid: {
        type: Number,
        require: true
    },
    mobilename: {
        type: String,
        min:3,
        max:100,
        require: true
    },
    mobileprice: {
        type: Number,
        require: true
    }
},
    {
        collection: 'Mobiles'
    });




module.exports = mongoose.model('posts', mobileSchema);
