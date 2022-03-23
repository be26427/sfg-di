package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service ("abcd")
public class PropertyGreeting implements GreetingService{
    @Override
    public String sayHello() {
        return "Property greeting";
    }
}