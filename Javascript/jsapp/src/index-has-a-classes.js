//has-a

class OrderService {
    constructor() {

    }
    findAllOrders() {
        return 'orders'
    }
}
class OrderController {
    constructor(orderService = new OrderService()) {
        //has-a
        this.orderService = orderService
    }
    fetchOrders() {
        return this.orderService.findAllOrders();
    }
}
let orderCtrl = new OrderController(new OrderService());
console.log(orderCtrl.fetchOrders())