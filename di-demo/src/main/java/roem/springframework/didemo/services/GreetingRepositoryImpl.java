package roem.springframework.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by roem on  02/12/19
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "howya bud";
    }

    @Override
    public String getSpanishGreeting() {
        return "hola amigos";
    }

    @Override
    public String getGermanGreeting() {
        return "yah whol";
    }
}
