//Passing multiple functions as parameter

// let login = (success, failure) => {
//     let userName = 'admin';
//     let password = 'admin';
//     if (userName === 'admin' && password === 'admin') {
//         success('Login success')
//     } else {
//         failure('Login failed');
//     }
// };

let login = (userName = '', password = '', success, failure) => {
    if (userName === 'admin' && password === 'admin') {
        success('Login success')
    } else {
        failure('Login failed');
    }
};

login('admin', 'admin', (status) => {
    console.log(status)
}, (err) => {
    console.log(err)
});
login('admin','admin',status => console.log(status), err => console.log(err));


login('foo','bar',status => console.log(status), err => console.log(err));