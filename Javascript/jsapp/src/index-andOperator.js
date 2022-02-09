// &&

var a = 10;
var b = 100;
var x = 10;
var y = 90;

var result = (a < b) && (x > y) // true && false
console.log(`Result is ${result}`)

//&& can be used with other values

var city = "Coimbatore";
var myCity = city && "Chennai";
console.log(`My city ${myCity}`) // true
city=""
console.log(`My city ${city && "newyork"}`)