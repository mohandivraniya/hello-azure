package com.example.helloazure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rest")
public class BasicRestController {

    @GetMapping("/getresourcename")
    public String getResourceName(){
        return "Success";
    }
}
