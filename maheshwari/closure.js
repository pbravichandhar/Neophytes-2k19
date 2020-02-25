//Closure example
function outer() {
    var a = 10;
    function inner() {
        a = 20;
    }
    return inner;
    return a;
}
var return_value = outer();

console.log(return_value);

array = [1, 2, 3, 4]
console.log(array);
console.dir(array);
console.log(return_value()); //not a function error

function init() {
    var name = "Mozilla";
    function displayName() {
        console.log(name);
    }
    displayName();
}
init();

