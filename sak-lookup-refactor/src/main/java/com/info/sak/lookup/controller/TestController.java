package com.info.sak.lookup.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    @GetMapping(name = "/hello")
    public String sayHello(@RequestParam(name = "name") String name ) {
        return "Welcome " + name;
    }
}
