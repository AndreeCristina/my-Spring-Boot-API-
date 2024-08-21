package ro.devfactory.myspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/greetings")
public class GreetingsController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello, I'm a Spring Boot App";
    }

    @GetMapping(path = "/goodbye")
    public String goodBye() {
        return "Good bye, see you soon!";
    }
}