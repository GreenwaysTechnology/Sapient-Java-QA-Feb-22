
//logic
function add() {
    return 10 + 10;
}
add();

//object template
function Employee() {
    //state and behaviour
    this.id = 1;
    this.name = 'Subramanian'
    //methods
    // this.calculateSalary = function () {
    //     return 100 *10;
    // }
    this.calculateSalary = (basicSalary = 100, noOfdays = 0) => basicSalary * noOfdays
}
//emp is variable,pointer to the object,reference variable
let emp = new Employee(); //constructor call
console.log(emp)
//how to access object properties
console.log(emp.id, emp.name, emp.calculateSalary(2000, 20));
