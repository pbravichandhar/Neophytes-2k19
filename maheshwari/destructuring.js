var arr = [1,2,3,4];
var [one, two, three] = arr;
const name = ['m','a','h','e','s','h'];
console.log(name);
console.log(...name);
console.log(one, two, three);
const numbers = [10,20,30,28];
console.log(Math.max.apply(Math, numbers));
console.log(Math.max(numbers)); // returns NaN
console.log(Math.max(...numbers));


const username = {
    firstname : `prabha`,
    lastname : `karan`,
    surname : `rathinasamy`
}
const {firstname, lastname, surname } = username;
console.log(username);