package com.example.demo;

import lombok.Getter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/santuario")
public class TestController {

    @GetMapping
    public String probarApi(){
        return "hello santuario";
    }
}
