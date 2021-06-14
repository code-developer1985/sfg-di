package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("propertyBase")
public class PropertyInjectedGreetingService implements GreetingService{

  @Override
  public String sayGreeting() {
      return "Hello there from PropertyBasedService";
  }
}
