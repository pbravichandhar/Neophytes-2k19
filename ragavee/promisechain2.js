let promise = new Promise((resolve, reject) => {
  resolve(10);
  reject(0);
});
promise.then(res => {
  console.log(res);
  return res + 10;
});
promise.then(res => {
  console.log(res);
  return res + 10;
});
promise.then(res => {
  console.log(res);
  return res + 10;
});
promise.then(res => {
  console.log(res);
});
promise.catch(reject => {
  console.log("error");
});
