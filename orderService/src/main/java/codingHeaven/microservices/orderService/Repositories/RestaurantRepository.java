package codingHeaven.microservices.orderService.Repositories;

import codingHeaven.microservices.orderService.Models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository <Restaurant, UUID> {
}
