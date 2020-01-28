module.exports = (app) => {
    const teacher = require('../Services/teachers.service.js');

    app.post('/register', teacher.create);

    app.post('/login', teacher.login);

    app.post('/profile', teacher.profile)

    app.post('/logout', teacher.logout);
}
