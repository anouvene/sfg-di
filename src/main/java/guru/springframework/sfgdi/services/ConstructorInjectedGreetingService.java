package guru.springframework.sfgdi.services;
import org.springframework.stereotype.Service;

@Service("constructorGreetingService")
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world !";
    }
}
