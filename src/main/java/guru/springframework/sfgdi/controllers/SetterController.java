package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    private GreetingService service;

    @Qualifier ("setterGreeting")
    @Autowired
    public void SetGreeting(GreetingService service)
    {
        this.service = service;
    }

    public String getGreeting() {
        return(service.sayHello());
    }
}
