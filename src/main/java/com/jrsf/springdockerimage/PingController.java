package com.jrsf.springdockerimage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void ping(){

        System.out.println("Everything working");
        System.out.println("Live reload worked too");
    }
}
