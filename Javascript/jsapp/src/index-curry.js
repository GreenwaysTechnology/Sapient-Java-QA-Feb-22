

function outer(a) {
    //  console.log('outter')
    return function (b) {
        //    console.log('inner-1')
        return function (c) {
            //      console.log('inner-2')
            return function (d) {
                //        console.log('inner-3')
                //can access all its outer function variables
                return `${a} ${b} ${c} ${d}`
            }
        }
    }
}
let res = outer('a')('b')('c')('d')
console.log(res);
//////////////////////////////////////////////////////////////////////////////////////

// let outerArrow = a => {
//     return b => {
//         return c => {
//             return d => {
//                 return `${a} ${b} ${c} ${d}`
//             }
//         }
//     }
// }

let outerArrow = a => b => c => d => `${a} ${b} ${c} ${d}`


let res1 = outerArrow('a')('b')('c')('d')
console.log(res1);