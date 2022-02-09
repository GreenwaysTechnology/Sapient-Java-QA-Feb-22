
var a = 10;
if (a) {
    console.log('a is true')
} else {
    console.log('a is false')
}
a = 0
if (a) {
    console.log('a is true')
} else {
    console.log('a is false')
}
var firstName=""
if (firstName) {
    console.log('firstName is true')
} else {
    console.log('firstName is false')
}
var city;
if (city) {
    console.log('city is true')
} else {
    console.log('city is false')
}
var res = 10 * undefined
if (res) {
    console.log('res is true')
} else {
    console.log('res is false')
}
//tenary and booleans

var message;
var greet = message ? "Hello" : "Hai";
console.log(greet)