package com.example.lab4_userservice.lab4.Controller;

import com.example.lab4_userservice.lab4.Entity.UserDetails;
import com.example.lab4_userservice.lab4.Interface.RegistrationServiceClient;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class UserController {

private RegistrationServiceClient register;


@PostMapping("/confirm-and-register")
    public Map<String,String> confirmAndRegister(@RequestBody UserDetails userDetails){

    String confirm = register.someDetails(userDetails);
    Map<String,String> responseMessage = new HashMap<>();
    responseMessage.put("message",confirm);
    return responseMessage;

    }

}
