new Promise((resolve, reject) => {
  resolve(10);
})
  .then(res => {
    console.log(res);
    return new Promise((resolve, reject) => {
      resolve(res + 10);
    });
  })
  .then(res => {
    console.log(res);
    return new Promise((resolve, reject) => {
      resolve(res + 10);
    });
  })
  .then(res => {
    console.log(res);
  });
