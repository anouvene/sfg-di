package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @Qualifier should be used in conjuction with @Autowired always.
 * This will indicate the bean name which needs to be Autowired in case of multiple beans with same type is present in the application context.
 * (so that spring can autowire by name.)
 *
 * @Primary should be used in conjuction with @Bean / @Autowired which indicates which bean should be given higher preference,
 * when there are multiple beans of same type is present.
 *
 * One of the classic use cases where you would use @Primary is when the framework(example spring-data) expects a bean of some type
 * (example EntityManager) but you have multiple datasources and you would have configured multiple Entity Managers.
 * In such cases @Qualifier doesn't quite help.
 *
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    @Autowired // Non-mandatory
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}