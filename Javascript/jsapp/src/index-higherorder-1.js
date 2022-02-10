
//higher order function and args parameter

let sayGreet = greet => {
    greet('Subramanian', 'Hello');
    greet();
}

sayGreet((name = 'foo', message = 'bar') => {
    console.log(`${message} ${name}`)
});
