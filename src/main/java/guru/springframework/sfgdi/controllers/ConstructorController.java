package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private final GreetingService service;

    public ConstructorController(@Qualifier ("constructorGreeting") GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return(service.sayHello());
    }
}
