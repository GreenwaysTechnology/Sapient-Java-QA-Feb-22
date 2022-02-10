//inner functions : functions are declared with in function

function outer() {
    console.log('outter')
    function inner() {
        console.log('inner')
    }
    inner();
}
outer();
//inner();