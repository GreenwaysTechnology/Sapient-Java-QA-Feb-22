// function outer(x) {
//     console.log('outter', x)
//     return function (y) {
//         // console.log('inner',y)
//         return `inner ${y}`
//     }
// }

// let outer = (x) => {
//     console.log('outter', x)
//     return (y) => {
//         // console.log('inner',y)
//         return `inner ${y}`
//     }
// }
let outer = x => {
    console.log('outter', x)
    return y =>`inner ${y}`
}
let value = outer(10)(34);
console.log(value);