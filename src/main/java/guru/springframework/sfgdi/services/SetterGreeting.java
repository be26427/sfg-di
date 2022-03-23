package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreeting implements GreetingService{
    @Override
    public String sayHello() {
        return "Setter greeting";
    }
}