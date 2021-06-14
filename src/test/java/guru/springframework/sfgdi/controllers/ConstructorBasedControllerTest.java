package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedControllerTest {

    ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        GreetingService greetingService = new ConstructorGreetingService();
        constructorBasedController = new ConstructorBasedController(greetingService);

    }

    @Test
    void getGreeting() {
        System.out.println(constructorBasedController.getGreeting());
    }
}