//functions can return values(can be any value)

function sayHello() {
    return 'Hello';
}
let hello = sayHello();
console.log(hello)

function add(a = 0, b = 0) {
    return a + b; //expression
}
console.log(add(10, 10))

function sayHai() {
    return // undefined
}
console.log(sayHai())
