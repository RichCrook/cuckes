var express = require('express');
var server = express(); // better instead
server.configure(function(){
  server.use("/app",express.static(__dirname + "/src/main/webapp"));
});
server.listen(3000);
console.log('Ready at http://localhost:3000/app/index.html');
