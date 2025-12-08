package com.microservice2.Controller;

import com.microservice2.Client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/main")
@RequestMapping("/api/v1")
public class MainController {
   /** @Autowired
    private Client client;
    //http://localhost:8085/api/v1/main
    @GetMapping("/call")
    public String getInfoFromMicroServices1(){
        return client.getData();
    }**/

   @GetMapping("/message")
    public String getmessage(){
       return "from microservice 2";
   }
}
