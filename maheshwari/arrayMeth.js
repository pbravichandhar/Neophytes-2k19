const arr = [23, 44, 21, 1, 54];

const evenArray = arr.filter(a => a % 2 === 0);
console.log(evenArray);

const mapArray = arr.map(a => a % 2 === 0);
console.log(mapArray);

const num = [1, 2, 3, 4, 5, 6, 7];
const sum = num.reduce((num1, num2) => {
    return num1 + num2;
});

const numbers = [2, 3, 4, 5, 11];
const newArray = numbers
    .filter(b => b % 2 === 0)
    .map(b => b * b)
    .reduce((b, c) => b + c);

console.log(`This the new array ${newArray}`);