//
let list = [1, 2, 3, 4, 5, 6] //numbers

list.forEach((value, index) => {
    console.log(`index ${index} value ${value}`)
});

//list of employees
let empList = [
    { id: 1, name: 'a', salary: 1000 },
    { id: 2, name: 'b', salary: 4000 },
    { id: 1, name: 'c', salary: 6000 }
];

empList.forEach((emp, index) => {
    console.log(`index ${index} value ${emp.name} ${emp.salary}`)
});