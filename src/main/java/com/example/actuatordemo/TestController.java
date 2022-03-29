package com.example.actuatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/testing")
    public String testing(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 500000; i++){
            builder.append(UUID.randomUUID());
        }
        return builder.toString();
    }
}
