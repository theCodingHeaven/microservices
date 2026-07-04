package codingHeaven.microservices.orderService.API;

import codingHeaven.microservices.orderService.Models.Order;
import codingHeaven.microservices.orderService.Services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController (OrderService service){
        this.orderService = service;
    }
    @PostMapping
    public boolean CreateOrder(@RequestBody Order order){

        return orderService.postOrder(order);
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderService.getOrders();
    }
}
