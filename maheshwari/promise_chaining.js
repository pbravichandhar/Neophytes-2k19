//Promise chaining
new Promise((res, rej) => {
    res(1)
    rej('Failed to execute')
}).then(result => {
    console.log(result);
    return result * 2;
}).then(result => {
    console.log(result);
    return result * 3;
}).then(result => {
    console.log(result);
    return result * 4;
}).then(result => {
    console.log(result);
    return result * 5;
}).then(result => {
    console.log(result);
}).catch((rej) => {
    console.log(rej);
})

