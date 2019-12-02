package roem.springframework.didemo.services;

public interface GreetingService {

    public default String sayGreeting() {
        return null;
    }

}
