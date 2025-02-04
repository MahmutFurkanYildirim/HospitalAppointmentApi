package com.furkanyildirim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = "/hello")
    public String Hey(int gender){
        if(gender == 1){
        return "Hello boy";
        }
        else if (gender == 2){
            return "Hello girl";
        }

        return "Cinsiyet belirtin";

    }
}
