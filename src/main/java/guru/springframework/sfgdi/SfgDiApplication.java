package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// Instancier un contexte
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SfgDiApplication.class);

		// ou bien
		//ApplicationContext ctx_bis = SpringApplication.run(SfgDiApplication.class, args);

		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println("\n\n------> constructorInjectedController");
		System.out.println(constructorInjectedController.sayHello());
	}
}


