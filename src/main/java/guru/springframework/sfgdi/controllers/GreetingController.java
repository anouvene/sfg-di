package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    public String sayHello() {
        return "Hello world!";
    }
}
