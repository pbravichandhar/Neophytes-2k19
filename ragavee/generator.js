function* generatorfunction() {
  yield 1;
  yield 2;
  return 3;
}

let generator = generatorfunction();

for (let value of generator) {
  console.log(value);
}
