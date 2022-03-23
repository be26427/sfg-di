package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController I18nController = (I18nController) ctx.getBean("I18nController");
		System.out.println(I18nController.sayHello());

		TestController control = (TestController) ctx.getBean("testController");
		System.out.println(control.getGreeting());

		ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
		System.out.println(constructorController.getGreeting());

		PropertyController propertyController = (PropertyController) ctx.getBean("propertyController");
		System.out.println(propertyController.getGreeting());

		SetterController setterController = (SetterController) ctx.getBean("setterController");
		System.out.println(setterController.getGreeting());

	}

}
