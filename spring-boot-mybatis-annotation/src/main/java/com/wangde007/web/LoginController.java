package com.wangde007.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {


    @RequestMapping("/admin")
    public String adminLoginHandler(){
//        if (error != null) {
//            return "login-failure";
//        }
        return "login";
    }
}
