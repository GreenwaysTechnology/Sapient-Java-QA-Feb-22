
function Employee(id = 1, name = 'Subramanian') {
    //state
    this.id = id;
    this.name = name;
    this.calculateSalary = (basicSalary = 100, noOfdays = 0) => basicSalary * noOfdays
}
let emp = new Employee(2,'ram'); //constructor call
console.log(emp.id, emp.name, emp.calculateSalary(2000, 20));

let emp1= new Employee(5,'arun');
console.log(emp1.id, emp1.name, emp1.calculateSalary(2000, 20));

let emp2=new Employee(4,'karthik')
console.log(emp2.id, emp2.name, emp2.calculateSalary(2000, 20));
