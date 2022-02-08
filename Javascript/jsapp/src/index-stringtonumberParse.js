//Type conversion : explicit

var a = 100; // a is number
var b = "10" // b value is number but type is string
var c = a * parseFloat(b); //here before computation js converts "10" into 10
console.log(`a ${a} b${b} result ${c}`)



