package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18NController i18nController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18nController.sayHello());

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
