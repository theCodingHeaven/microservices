package codingHeaven.microservices.orderService.Services;

import codingHeaven.microservices.orderService.Models.Restaurant;

import java.util.List;

public interface IRestaurantService {

    public List<Restaurant> getListOfRestuarants();

}
