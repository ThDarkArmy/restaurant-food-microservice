package tda.darkarmy.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/restaurantServiceFallBack")
    public String restaurantServiceFallBackMethod() {
        return "Restaurant Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/foodServiceFallBack")
    public String foodServiceFallBackMethod() {
        return "Food Service is taking longer than Expected." +
                " Please try again later";
    }

}
