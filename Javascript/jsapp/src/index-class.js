//es 6 class
// function Employee(id = 1, name = 'Subramanian') {
//     //state
//     this.id = id;
//     this.name = name;
//     this.calculateSalary = (basicSalary = 100, noOfdays = 0) => basicSalary * noOfdays
// }

class Employee {
    //special function ; constructor function
    salary = 100;
    constructor(id = 1, name = 'Subramanian') {
        this.id = id;
        this.name = name;
    }
    //methods
    calculateSalary(value) {
        return this.salary * value
    }

}


let emp = new Employee(2, 'ram'); //constructor call
console.log(emp.id, emp.name, emp.calculateSalary(800));

