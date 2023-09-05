package br.com.gabriel.restwithspringbootandjava.controller;

import br.com.gabriel.restwithspringbootandjava.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "HIAQWDQW") String name){
        return new Greeting(counter.getAndIncrement(), template.formatted(name));
    }

}
