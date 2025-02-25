package com.example.GreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingAppDev {

    @GetMapping("/get")
    public String show(){
        return "Hello from bridgeLabz";
    }

    @RequestMapping(value = {"" , "/","/home"})
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    @RequestMapping(value = {"/query"} , method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "hello " + name + "!";
    }


    //localhost:9191/greet/param/Vinay
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + " ! ";
    }

    //localhost:9191/greet/post
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }

    //localhost:9191/greet/put/Vinay?lastName=chaurasia
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName){

        return "hello " + firstName + " " + lastName + "!";
    }

    //http://localhost:9191/greet/delete/Vinay
    @DeleteMapping("/delete/{firstName}")
    public String deleteFirstName(@PathVariable String firstName){
        return "First name : " + firstName + " deleted !";
    }
}
