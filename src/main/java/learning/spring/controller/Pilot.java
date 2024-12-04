package learning.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pilot")
public class Pilot {

    @RequestMapping("/greet")
    public String greet() {
        return "Hello, Pilot!";
    }
}
