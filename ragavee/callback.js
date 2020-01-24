function wish(name) {
  console.log("Hello " + name);
}

function inputname(call) {
  var name = "ragavee";
  call(name);
}
inputname(wish);
