let promise = new Promise(function(resolve, reject) {
  let name1 = "ragavee";
  let name2 = "a";
  if (name1 != name2) {
    resolve();
  } else reject();
});
promise
  .then(function() {
    console.log("true");
  })
  .catch(function() {
    console.log("false");
  });
