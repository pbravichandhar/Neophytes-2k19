new Promise((resolve, reject) => {
  resolve(10);
  //reject(0);
})
  .then(res => {
    console.log(res);
    return res + 10;
  })
  .then(res => {
    console.log(res);
    return res + 10;
  })
  .then(res => {
    console.log(res);
    return res + 10;
  })
  .then(res => {
    console.log(res);
  });
// .catch(reject => {
//   console.log("error");
// });
