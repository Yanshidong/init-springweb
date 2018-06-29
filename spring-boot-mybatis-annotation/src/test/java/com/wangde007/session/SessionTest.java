package com.wangde007.session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SessionTest {

    @Autowired
    HttpServletRequest request;

    @Test
    public void sessionSet()
    {
        Object o = request.getSession().getAttribute("springboot");
        if(o == null){
            o = "spring boot 牛逼了!!!有端口"+request.getLocalPort()+"生成";
            request.getSession().setAttribute("springboot", o);
        }

         System.out.println("端口=" + request.getLocalPort() +  " sessionId=" + request.getSession().getId() +"<br/>"+o);
    }

}
