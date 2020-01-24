let array1 = [10, 20];
function one() {
  setTimeout(function() {
    console.log("1. First calling Second");
    array1.unshift(02);
    console.log(array1);
    two();
  }, 2000);
}

function two() {
  console.log("2. Second thing");
  array1.unshift(01);
  console.log(array1);
}

function three() {
  setTimeout(function() {
    console.log("3. Third calling fourth");
    array1.unshift(04);
    console.log(array1);
    four();
  }, 1000);
}

function four() {
  console.log("4. Fourth thing");
  array1.unshift(03);
  console.log(array1);
}

one();
three();
