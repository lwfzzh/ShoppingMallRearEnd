package com.example.shoppingmallrearend.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {
    @GetMapping("/")
    public Map<String, String> test1(){
        return new HashMap<>();
    }
}
