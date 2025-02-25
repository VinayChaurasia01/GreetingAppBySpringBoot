package com.greetingapp.controller;

import com.example.GreetingApp.User;
import com.greetingapp.model.Greeting;
import com.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    //UC1
    @GetMapping("/greet")
    public Greeting getGreeting() {
        return new Greeting("Hello from BridgeLabz");
    }

    @PostMapping("/greet")
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return greeting;
    }

    @PutMapping("/greet")
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        return new Greeting("Updated: " + greeting.getMessage());
    }

    @DeleteMapping("/greet")
    public Greeting deleteGreeting() {
        return new Greeting("Greeting deleted");
    }


    //UC2
    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greetservice")
    public Greeting getGreetings() {
        return new Greeting(greetingService.getGreetingMessage());
    }
    //http://localhost:8080/api/greetservice



    //UC3

    // GET Request - Returns a greeting message with optional name inputs
    /*@GetMapping("/greetinput")
    public Greeting getGreeting(@RequestParam(required = false) String firstname,
                                @RequestParam(required = false) String lastname) {
        return new Greeting(greetingService.getGreetingMessage(firstname, lastname));
    }*/
    //http://localhost:8080/api/greetinput?firstname=Vidhi&lastname=Jain

    //UC4

}
