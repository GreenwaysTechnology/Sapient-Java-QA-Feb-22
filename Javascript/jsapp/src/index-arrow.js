//arrow 
//es 5
let hai = function () {
    console.log('hai');
}
hai()
//arrow version
let hello = () => {
    console.log('hello');
}
hello();

//if function has only one line of body we can remove {}
let greet = () => console.log('greet')
greet();

//args and parameters
let add = (a = 0, b = 0) => {
    let c = a + b;
    return c;
}
console.log(add(10, 10))

add = (a = 0, b = 0) => {
    return a + b;
}
console.log(add(10, 10))
//if the function has only return statementwe can remove {} and return statement
add = (a = 0, b = 0) => a + b
console.log(add(10, 10))

//if function takes single arg, no default value, return the same: we can remove ()
let doStuff = message => message;
console.log(doStuff('foo'))