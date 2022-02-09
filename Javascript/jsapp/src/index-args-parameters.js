//parameters can be any type of value - numbers,strings,undefined,NaN,object,function...

function sayHello(name) {
    console.log(`Hello ${name}`)
}
//pass value
sayHello('Subramanian')
sayHello(10);
//no value
sayHello() //undefined
/////////////////////////////////////////////////////////////////////////////////////
//Runtime errors and parameters

function multiply(a, b) {
    var c = a * b;
    console.log(`The result is ${c}`);
}
multiply(10, 10)
multiply() //would cause NaN.

//default args : if args are undefined, we can supply default values
console.log('....default args....')
function multi(a, b) {
    a = a !== undefined ? a : 0;
    b = b !== undefined ? b : 0;
    var c = a * b;
    console.log(`The result is ${c}`);
}

multi(10, 10)
multi()
//es 6 default args
function calculate(a = 0, b = 0) {
    var c = a * b;
    console.log(`The result is ${c}`);
}
calculate(10, 10)
calculate()
//args are positional : positional paramerters, parameters can be passed in order only
calculate(undefined, 90) //here i want to pass only b value
/////////////////////////////////////////////////////////////////////////////////////
//more parameters
//i dont know in advance how may parameters i am going to pass.

//var args : variable arguments
function log() {
    //special variable through which you can collect all parameters
    console.log(arguments)
}
log('Hello', 'myapp', '1.0.0', 'Sapient')
log('Sapient')
log('hello', 'Sapient')

//es 6 var args: operator: Rest operator(...)
function logDetails(message,...myargs) {
    console.log(myargs,message)
}
logDetails('Greet','Hello', 'myapp', '1.0.0', 'Sapient')
logDetails('Sapient','1.0.0')
logDetails('welcome','hello', 'Sapient')
