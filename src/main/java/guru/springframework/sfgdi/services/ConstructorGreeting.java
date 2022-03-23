package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreeting implements GreetingService{
    @Override
    public String sayHello() {
        return "Constructor greeting";
    }
}
