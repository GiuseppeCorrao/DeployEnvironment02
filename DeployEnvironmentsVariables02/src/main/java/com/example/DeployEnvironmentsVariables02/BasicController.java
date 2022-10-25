package com.example.DeployEnvironmentsVariables02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    Environment environment;

    @GetMapping("/get")
    public String getMessage(){
        String message = environment.getProperty("varTree.welcomeMsg");

        return message;
    }
}
