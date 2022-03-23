package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    private final GreetingService service;

    public TestController(GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return(service.sayHello());
    }
}
