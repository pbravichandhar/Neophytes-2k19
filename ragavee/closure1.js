function outer() {
  var message = "hello";
  function inner() {
    console.log(message);
  }
  inner();
}
outer();
