//closure

// function counter() {
//     let count = 0;
//     //closure
//     return function () {
//         return ++count;
//     }
// }
let counter = () => {
    let count = 0;
    //closure
    return () => ++count
}

let inc = counter(); //here which returns function pointer
console.log(inc())
console.log(inc())
console.log(inc())
