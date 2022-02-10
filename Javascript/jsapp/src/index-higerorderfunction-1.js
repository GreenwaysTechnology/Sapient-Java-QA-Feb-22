//Higher order function: function can be passed as parameter to another function

//a=10;b=10
//a=x;b=y
let add = function (a, b) {
    console.log(`a${a} b${b}`)
};
add(10, 10)//pass values directly
let x = 10;
let y = 70;
add(x, y)
//function as parameter
//hello=function () {
//console.log('hello');
//}

//sayGreet is called higher order function
let sayGreet = function (greet) {
    //greet()
    greet();
};
sayGreet(function () {
    console.log('hello');
});
let hai = function () {
    console.log('hai')
};
sayGreet(hai);

function sayWelcome(welcome) {
    welcome();
}
sayWelcome(function () {
    console.log('welcome')
});
/////////////////////////////////////////////////////////////////////////////////////
//arrow version
// let delay = (callback) => {
//    callback();
// }
let delay = callback => callback();
// delay(function () {
//     console.log('delay')
// });
delay(() => console.log('delay'));
let timeout = () => console.log('timeout');
delay(timeout)
/////////////////////////////////////////////////////////////////////////////////////