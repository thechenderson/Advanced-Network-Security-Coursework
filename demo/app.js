const express = require('express');
const path = require('path');
const logger = require('morgan');

const app = express();
app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({extended: false}));
app.use('/reveal.js', express.static(path.join(__dirname, 'node_modules/reveal.js/')));
app.use(express.static(path.join(__dirname, 'public')));

app.listen(8081, () => {
    console.log('Presentation running on port 8080')
});

module.exports = app;
