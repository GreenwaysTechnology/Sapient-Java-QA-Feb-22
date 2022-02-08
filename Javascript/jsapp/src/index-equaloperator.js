//equal operator

var a = 10;
var b = 10;
//compare two values
var c = a == b; // == equal operator
console.log(`c ${c}`)


//here we compare x and y , but values are equal, but types are not equal, but result is true : Bug in the language itself.
var x = 10;
var y = "10";
var z = x == y;
console.log(`z ${z}`)

//=== - This is right comparsion
var z1 = x === y;
console.log(`z1 ${z1}`)