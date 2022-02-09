//block scope
function login(name, password) {
    //var status
    if (name === 'admin' && password === 'admin') {
        //variable status is declared within if statement : block scope
          var status = "login success"
    }
    //access the status variable outside the block
    console.log(status);

}
login("admin", "admin")
login()

//block scope with let keyword
function auth(name, password) {
    //var status
    if (name === 'admin' && password === 'admin') {
        //variable status is declared within if statement : block scope
          let isValid = "login success"
    }
    //access the status variable outside the block
    console.log('status',isValid); //Uncaught ReferenceError: isValid is not defined
    //at auth (index.js:23:26)
    //at index.js:26:1

}
auth("admin", "admin")
auth()