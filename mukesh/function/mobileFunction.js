const express = require('express');
const router = express.Router();
const bodyparser=require('body-parser')
const urlencoder=bodyparser.urlencoded({extended:false})
const mobileDB = require('../Schema/mobileSchema');
const jwt = require('jsonwebtoken');

const jwtTokenDetails = (req, res, next) => {
    const { authorization } = req.headers;

    jwt.verify(authorization, process.env.SECRET_TOKEN, (err, data) => {
        if (err)
            res.status(403).json({ message: "you can not Modify" });
        console.log(data);
        req.user = data;

    })
    next();
}

router.get('/', async (req, res) => {
    try {
        const allMobile = await mobileDB.find();
        res.json(allMobile);
    } catch (error) {
        res.json({ message: error });
    }
});

router.get('/sortByPrice', async (req, res) => {
    try {
        const price={mobileprice:1};
        const allMobile = await mobileDB.find().sort(price);
        res.json(allMobile);
    } catch (error) {
        res.json({ message: error });
    }
});

router.get('/sortByName', async (req, res) => {
    try {
        const name={mobilename:1};
        const allMobile = await mobileDB.find().sort(name);
        res.json(allMobile);
    } catch (error) {
        res.json({ message: error });
    }
});

router.post('/findByName', async (req, res) => {

        try {
        let brand = await mobileDB.find({ mobilename: req.body.mobilename });
        res.json(brand);
    } catch (error) {
        res.json({ message: error });
    }
});

router.post('/findBelowPrice', urlencoder,async (req, res) => {

    
    try {
        let below = await mobileDB.find({ 
            mobileprice:{$lt: req.body.mobileprice }
        });
        res.json(below);
    } catch (error) {
        res.json({ message: error });
    }
});

router.post('/findBelowPriceAndBrand', urlencoder,async (req, res) => {

    
    try {
        let below = await mobileDB.find({ 
            mobilename: req.body.mobilename,
            mobileprice:{$lt: req.body.mobileprice }
        });
        res.json(below);
    } catch (error) {
        res.json({ message: error });
    }
});


router.post('/', async (req, res) => {

    const sameId = await mobileDB.findOne({ mobileid: req.body.mobileid });
    if (sameId) return res.status(400).send('Product id already exists');

    try {
        const updateMobile = new mobileDB({
            mobileid: req.body.mobileid,
            mobilename: req.body.mobilename,
            mobileprice: req.body.mobileprice
        });
        const newMobile = await updateMobile.save();
        res.json(newMobile);
    } catch (error) {
        res.json({ message: error });
    }
});

router.get('/:id', async (req, res) => {

    const sameId = await mobileDB.findOne({ mobileid: req.params.id });
    if (!sameId) return res.status(400).send(`Mobile id doesn't exists`);
    else {
        const findMobile = await mobileDB.findOne({ mobileid: req.params.id });
        res.json(findMobile)
    }

});

router.delete('/:id', jwtTokenDetails, async (req, res) => {
    if (req.user.isAdmin == true) {
        try {
            const deleteMobile = await mobileDB.remove({ _id: req.params.id });
            res.json(deleteMobile);
        } catch (error) {
            res.json(error);
        }
    } else
        res.status(401).json({ message: "logined user not Admin" })
});

router.patch('/:id', jwtTokenDetails, async (req, res) => {
    if (req.user.isAdmin == true) {
        try {
            const updatePrice = await mobileDB.updateOne({ _id: req.params.id }, { $set: { mobileprice: req.body.mobileprice } });
            res.json(updatePrice);
        } catch (error) {
            res.json(error);
        }
    } else
        res.status(401).json({ message: "logined user not Admin" })
});

module.exports = router;
