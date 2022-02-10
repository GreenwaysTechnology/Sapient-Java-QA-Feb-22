//literal objects and has-a

let employee = {
    id: 1,
    name: 'subramanian',
    //has-a - nested object
    address: {
        city: 'Coimbatore'
    }
}
console.log(employee.name,employee.address.city)