package com.wangde007.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.authorizeRequests()
                //指定任何用用都可以访问多个url,
                //任何用户都可以访问到 以 /static，/signup , /about 开头的url
                .antMatchers("/static/**","/assets/**","/about").permitAll()
                //以 admin 开头的 url只能让拥有 ROLE_ADMIN的角色访问,使用hasROLE方法不用ROLE_前缀
//                .antMatchers("/addmin/**").hasRole("ADMIN")
                //任何以 /db 开头的url 需要同时拥有 ROLE_ADMIN 和ROLE_DBA
                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .antMatchers("/db/**").hasAnyRole("ADMIN","DBA")

                .anyRequest().authenticated()
                .and()
                //指定表单登陆，自定义登陆页
                .formLogin()
                    .loginPage("/admin/login")
                    .permitAll()//允许访问登陆页
                    .defaultSuccessUrl("/admin/home")
                .and()
                    .rememberMe().tokenValiditySeconds(1209600).key("wangde007")
                .and()
                    .logout()
                    .logoutUrl("/admin/logout")
                    .logoutSuccessUrl("/admin/login")
                    .permitAll()
                .and()
                .httpBasic()

        ;

    }
}
