package roem.services;

import org.springframework.stereotype.Service;

/**
 * Created by roem on  01/11/19
 */
@Service
public class SecondaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the secondayr";
    }
}
