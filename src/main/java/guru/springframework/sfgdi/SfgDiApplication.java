package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorBasedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println("I18N Bean ******");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println("Primary Bean ******");
        System.out.println(myController.sayHello());

        System.out.println("Property ******");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("Setter ******");
        SetterBasedController setterBasedController =  (SetterBasedController) applicationContext.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());

        System.out.println("Constructor ******");
        ConstructorBasedController constructorBasedController = (ConstructorBasedController) applicationContext.getBean("constructorBasedController");
        System.out.println(constructorBasedController.getGreeting());
    }

}
