package codingHeaven.microservices.orderService.Services;

import codingHeaven.microservices.orderService.Events.OrderProducer;
import codingHeaven.microservices.orderService.Models.Order;
import codingHeaven.microservices.orderService.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepo;
    private final OrderProducer orderProducer;

    public OrderService(OrderRepository repo,
                        OrderProducer producer){
        this.orderRepo = repo;
        this.orderProducer = producer;
    }

    public List<Order> getOrders() {

        return orderRepo.findAll();
    }

    public boolean postOrder(Order order){

        try{
            orderRepo.save(order);
            orderProducer.sendOrderCreated(order.toString());
            return true;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
