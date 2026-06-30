package codingHeaven.microservices.orderService.API;

import codingHeaven.microservices.orderService.Models.Restaurant;
import codingHeaven.microservices.orderService.Services.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restuarantService;

    public RestaurantController(RestaurantService restuarantService) {
        this.restuarantService = restuarantService;
    }

    @GetMapping
    public List<Restaurant> getListOfRestuarants() {
        return restuarantService.getListOfRestuarants();
    }
}
