package com.example.demo.dao;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class lidorController {

    @GetMapping("/")
    String guest (){
        return "<h1> welcome guest </h1>";
    }
    @GetMapping("/user")
    String user (){
        return "<h1> welcome User </h1>";
    }
    @GetMapping("/admin")
    String admin (){
        return "<h1> welcome Admin </h1>";
    }

}
