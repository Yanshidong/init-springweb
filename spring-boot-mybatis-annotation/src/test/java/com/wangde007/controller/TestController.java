package com.wangde007.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/test/session")
    public String getSetSession(HttpServletRequest request)
    {
        Object o = request.getSession().getAttribute("springboot");
        if(o == null){
            o = "spring boot 牛逼了!!!有端口"+request.getLocalPort()+"生成";
            request.getSession().setAttribute("springboot", o);
        }

        String willReturn ="端口=" + request.getLocalPort() +  " sessionId=" + request.getSession().getId() +"<br/>"+o;
        System.out.println("端口=" + request.getLocalPort() +  " sessionId=" + request.getSession().getId() +"<br/>"+o);
        return willReturn;
    }
}
