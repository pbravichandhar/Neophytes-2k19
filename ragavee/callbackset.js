function one() {
  setTimeout(function() {
    console.log("one");
  }, 5000);
}
function two() {
  console.log("two");
}
one();
two();
