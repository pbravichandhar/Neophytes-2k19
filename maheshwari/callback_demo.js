function serverRequest(query, call) {
  setTimeout(function () {
    let res = query + "full!";
    call(res);
  }, 1000);
}

function getResults(results) {
  console.log("Response from the server: " + results);
}
serverRequest("The glass is half ", getResults);

