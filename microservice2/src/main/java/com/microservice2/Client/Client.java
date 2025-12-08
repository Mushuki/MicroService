package com.microservice2.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="MICROSERVICEEXAMPLE")
public interface Client {

    @GetMapping("/api/v1/data")
    public String getData();
}
