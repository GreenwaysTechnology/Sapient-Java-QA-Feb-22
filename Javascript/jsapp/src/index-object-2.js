
function Employee() {
    //state
    this.id = 1;
    this.name = 'Subramanian'
    this.calculateSalary = (basicSalary = 100, noOfdays = 0) => basicSalary * noOfdays
}
let emp = new Employee(); //constructor call

//access object properties and reinitalize the value
emp.id =100;
emp.name = 'Ram'
console.log(emp.id, emp.name, emp.calculateSalary(2000, 20));
