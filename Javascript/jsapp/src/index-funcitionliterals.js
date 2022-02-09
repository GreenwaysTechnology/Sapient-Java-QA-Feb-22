//function literal

//syntax -1
function sayHello() {
    console.log('Hello')
}
//assign the function to a variable
let hello = sayHello;
hello();

//syntax 2
//here the function is assinged directly to the variable
// function has no name - anonmous function
let hai = function () {
    console.log('hai')
};
hai();