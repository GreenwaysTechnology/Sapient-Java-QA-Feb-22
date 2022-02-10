let sayGreet = greet => {
    let res = greet('Subramanian', 'Hello');
    console.log(res);
}

sayGreet((name = 'foo', message = 'bar') => {
    return `${message} ${name}`;
});

sayGreet((name = 'foo', message = 'bar') => `${message} ${name}`);