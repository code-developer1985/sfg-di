package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService{

  @Override
  public String sayGreeting() {
    return "Hola I18n Spanish folks!";
  }
}
