package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;
    GreetingService greetingService;
    @BeforeEach
    void setUp() {
      setterBasedController = new SetterBasedController();
      greetingService = new ConstructorGreetingService();
      setterBasedController.setGreetingService(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }
}