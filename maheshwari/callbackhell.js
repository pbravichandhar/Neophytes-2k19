//Callback hell example
function one() {
  setTimeout(function () {
    console.log('1. First thing setting up second thing');
    setTimeout(function two() {
      console.log('2. Second thing setting up third thing');
      setTimeout(function three() {
        console.log('3. Third thing setting up fourth thing');
        setTimeout(function four() {
          console.log('4. Fourth thing');
        }, 1000);
      }, 3000);
    }, 500);
  }, 2000);
};
one();

function onee() {
  let array = ['23', '45', '67', '1', '32'];
  console.log(two(array));
  function two(array) {
    let evenArr = array.filter(a => a % 2 !== 0);
    three(evenArr);
    return array.sort();
    function three(array) {
      console.log(array);
      console.log("Inside third function");
    }
  }
}
onee();
