//1.concatenating 2 arrays
let array1 = [10, 20];
let array2 = [30, 40];
array = [...array1, ...array2];
console.log(array);

//2.copying 2 arrays without spread
let arr = ["a", "b", "c"];
let arr2 = arr;
arr2.push("d");
console.log(arr2);
console.log(arr); // even affected the original array(arr)

//3.spread operator for copying
let arr = ["a", "b", "c"];
let arr2 = [...arr];
console.log(arr);
arr2.push("d"); //inserting an element at the end of arr2
console.log(arr2);
console.log(arr);

//4.expand array without spread
let array1 = [10, 20];
let array2 = [array1, 30];
console.log(array2);

//5.expand array with spread
let array1 = [10, 20];
let array2 = [...array1, 30];
console.log(array2);
