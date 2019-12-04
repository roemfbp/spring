package roem.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;
import roem.springframework.didemo.services.GreetingService;

/**
 * Created by roem on  31/10/19
 */
@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }


}
