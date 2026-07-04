package codingHeaven.microservices.orderService.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import java.util.UUID;

@Data
@Entity
@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue
    private UUID id;

    private String userFullName;

    private String deliveryAddress;

    private String restaurantName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Food> orderItems;
    @Override
    public String toString() {

        StringBuilder items = new StringBuilder();

        if (orderItems != null && !orderItems.isEmpty()) {
            for (Food food : orderItems) {
                items.append(food.getName())
                        .append(" ($")
                        .append(food.getPrice())
                        .append("), ");
            }

            // Remove the last ", "
            items.setLength(items.length() - 2);
        }

        return "Order {" +
                "id=" + id +
                ", user='" + userFullName + '\'' +
                ", address='" + deliveryAddress + '\'' +
                ", restaurant='" + restaurantName + '\'' +
                ", items=[" + items + "]" +
                '}';
    }

}
