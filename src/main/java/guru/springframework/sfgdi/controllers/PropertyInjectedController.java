package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    //Injection By property
    @Autowired
    public GreetingService greetingService;

    public PropertyInjectedController() {
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
