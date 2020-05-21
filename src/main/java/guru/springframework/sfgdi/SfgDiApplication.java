package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

		System.out.println(greetingController.sayHello());
	}

}
