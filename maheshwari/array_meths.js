let arr = ["I", "am", "not", "student"];
delete arr[2];
console.log(`After delete ` + arr.length);
arr.splice(2, 1);
console.log(`After Splice ` + arr.length);
console.log(arr)
console.log(arr.indexOf("am"));

console.log("sorting  " + arr.sort());
console.log(arr.reverse());
let str = "hai"
console.log(str.split(''));

arr.push("Thank you");
arr.unshift("Hai")

let sentence = arr.join(" ");
console.log(sentence);

console.log(arr);