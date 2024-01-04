package com.assignment6.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
       return "hello world";
    }

    @PatchMapping("/hello")
    public String patchHello(){
        return "HELLO WORLD!!!";
    }

    @GetMapping("/hiroshi")
    public Hiroshi getHiroshi() {
        return new Hiroshi("野原ひろし", 35, 180);
    }


}
