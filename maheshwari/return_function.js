function result(num1, num2) {
    console.log("hai");
    let sum = num1 + num2;
    return sum;
}
function add(result) {
    return result(1, 2);
}
console.log(add(result));

