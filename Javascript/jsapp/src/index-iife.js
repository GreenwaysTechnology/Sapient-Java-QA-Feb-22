
(function () {
    console.log('init')
})()

//block scope implementation using iife functions:not recommended now a days,use let statement.

//block scope
function login(name, password) {
    //var status
    if (name === 'admin' && password === 'admin') {
        //variable status is declared within if statement : block scope
        (function () {
            var isValid = "login success"
        })();
    }
    //access the status variable outside the block
    console.log(isValid)

}
login("admin", "admin")
login()