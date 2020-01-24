//Promise example
let p = new Promise((res, rej) => {
  let a = 1 + 1;
  if (a == 2) {
    res('Success');
    return true;
  } else {
    rej('Failed');
  }
})

p.then((msg) => {
  console.log('Inside then ' + msg);
}).catch((message) => {
  console.log('Inside catch ' + message);
})


let p1 = new Promise((resolve, reject) => {
  setTimeout(() => resolve('p1_delayed_resolution'), 1000);
});

let p2 = new Promise((resolve, reject) => {
  reject(new Error('p2_immediate_rejection'));
});
var p2 = new Promise((resolve, reject) => {
  reject(new Error('p2_delayed_resolution'));
});

Promise.all([
  p1.catch(error => { return error }),
  p2.catch(error => { return error }),
]).then(values => {
  console.log(values[0]) // "p1_delayed_resolution"
  console.error(values[1]) // "Error: p2_immediate_rejection"
})

