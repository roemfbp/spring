package roem.springframework.didemo.services;

/**
 * Created by roem on  28/11/19
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greeetingRepository) {
        this.greetingRepository = greeetingRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
