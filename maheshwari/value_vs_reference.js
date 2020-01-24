//value vs refernce in java script
a = 10;
const b = a;
a = true;
console.log(a, b);
console.log(typeof (a), typeof (b));
arr = [1, 2, 3, 4]
arr.push(1)
arr1 = arr
console.log(arr, arr1)
console.log(arr === arr1)
console.log(typeof (arr), typeof (arr1));
let d = {
    first: 10,
    second: 20
}
let c = {
    first: 30,
    second: 20
}
console.log(d === c);
console.log(c, d);
c = d;
console.log(d === c);
console.log(c, d);



