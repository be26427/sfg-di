package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service ("iService")
public class I18nEnglishGreeting implements GreetingService{
    @Override
    public String sayHello() {
        return "Heaven - EN";
    }
}
