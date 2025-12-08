package com.MicroServiceExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MassageController {
    //  /api/v1/data
    @GetMapping("/data")
    public String getData(){
      return "hello from get data of microservice1";
    }
}
