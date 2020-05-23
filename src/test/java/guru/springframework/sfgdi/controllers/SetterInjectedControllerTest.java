package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    @DisplayName("Should not throw an exception")
    void GreetingService() {
        String message = assertDoesNotThrow(() -> this.controller.getGreetingService().sayGreeting());
        assertEquals("Hello, you are welcome", message);
    }

    @Test
    @DisplayName("Should display a message")
    void sayHello() {
        System.out.println(this.controller.sayHello());
    }
}