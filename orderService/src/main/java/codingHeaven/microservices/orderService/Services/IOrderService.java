package codingHeaven.microservices.orderService.Services;

import codingHeaven.microservices.orderService.Models.Order;

import java.util.List;

public interface IOrderService {

    public boolean postOrder(Order order);
    public List<Order> getOrders();

}
