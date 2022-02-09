//function scope

function add() {
    var a = 10;
    var b = 20;
    var c = a + b;
    console.log(`a ${a} b ${b} c${c}`)
}
add();
//trying to access the function scoped variable
console.log(`a ${a} b ${b} c${c}`) //error Uncaught ReferenceError: a is not defined
//at index.js:11:18