package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingService service;

    public I18NController(@Qualifier("i18nService") GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return(service.sayHello());
    }
}
