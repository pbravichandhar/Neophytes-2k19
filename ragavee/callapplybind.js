let obj = { name: "ragavee" };

let greeting = function(a) {
  return "welcome " + this.name + " to " + a;
};
//call()
console.log(greeting.call(obj, "calibraint")); //obj--> refers to the 'this' value
//apply()
let array = ["calibraint"];
console.log(greeting.apply(obj, array));
//bind()
let bound = greeting.bind(obj);
//console.dir(bound);
console.log(bound("calibraint"));
