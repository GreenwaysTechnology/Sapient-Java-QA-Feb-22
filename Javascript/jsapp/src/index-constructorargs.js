
function Employee(id = 1, name = 'Subramanian') {
    //state
    this.id = id;
    this.name = name;
    this.calculateSalary = (basicSalary = 100, noOfdays = 0) => basicSalary * noOfdays
}
let emp = new Employee(2,'ram'); //constructor call
console.log(emp.id, emp.name, emp.calculateSalary(2000, 20));
