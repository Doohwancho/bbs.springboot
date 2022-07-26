package com.cho.bbs.controller;

import lombok.Builder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    String hello() {
        return "Hello";
    }
}
