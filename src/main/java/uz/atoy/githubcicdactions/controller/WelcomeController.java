package uz.atoy.githubcicdactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to endpoint /welcome, image version 1.1, text value hello world.";
    }
}
