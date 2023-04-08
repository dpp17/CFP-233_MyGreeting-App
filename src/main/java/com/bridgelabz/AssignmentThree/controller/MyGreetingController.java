package com.bridgelabz.AssignmentThree.controller;

import com.bridgelabz.AssignmentThree.model.Messages;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greet")
public class MyGreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = {"/","/home"})
    public Messages getMessageFromUser(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Messages(counter.incrementAndGet(), String.format(template,name));
    }

    @GetMapping("/{name}")
    public Messages greetings(@PathVariable String name) {
        return new Messages(counter.incrementAndGet(), String.format(template, name));
    }

}
