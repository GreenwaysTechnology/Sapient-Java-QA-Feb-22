
// let employee = {
//     id: 1,
//     name: 'Subramanian',
//     calculateSalary: function () {
//         return 100
//     }
// }


// let employee = {
//     id: 1,
//     name: 'Subramanian',
//     calculateSalary: ()=> {
//         return 100
//     }
// }


let employee = {
    id: 1,
    name: 'Subramanian',
    calculateSalary() {
        return 100
    }
}
console.log(employee.id, employee.name, employee.calculateSalary())
employee.id =90;
employee.name='Ram'
console.log(employee.id, employee.name, employee.calculateSalary())
