package codingHeaven.microservices.orderService.Services;


import codingHeaven.microservices.orderService.Models.Restaurant;
import codingHeaven.microservices.orderService.Repositories.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService implements IRestaurantService {

    private final RestaurantRepository restaurantRepo;

    public RestaurantService(RestaurantRepository restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }
    public List<Restaurant> getListOfRestuarants(){

        return restaurantRepo.findAll();
    }

}
