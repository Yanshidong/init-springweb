package com.wangde007.Impl;

import com.wangde007.SecurityUser;
import com.wangde007.entity.UserInfoEntity;
import com.wangde007.enums.UserInfoTypeEnum;
import com.wangde007.mapper.UserInfoMapper;

import com.wangde007.utils.MyStringUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class MyUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    private UserInfoEntity userInfoEntity;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //判断 username 是 手机号/邮箱/用户名 ，以决定使用不同的type
        UserInfoEntity userParam=new UserInfoEntity();
        userParam.setType(UserInfoTypeEnum.LOCAL);
        if(MyStringUtil.checkPhone(s)){
            //本地用户-手机号登陆
            userParam.setPhone(s);
            userParam.setType(UserInfoTypeEnum.LOCAL);
             userInfoEntity=userInfoMapper.getUserByTypeAndPhone(userParam);
        }else if(MyStringUtil.isEmail(s)){
            //本地用户-邮箱登陆
           userParam.setEmail(s);
            userParam.setType(UserInfoTypeEnum.LOCAL);
             userInfoEntity=userInfoMapper.getUserByTypeAndEmail(userParam);
        }else{
            //本地用户-用户名登陆
             userInfoEntity=userInfoMapper.getUserByTypeAndName(userParam);
        }

        if (userInfoEntity == null) {
            throw new UsernameNotFoundException("UserName " + s + " not found");
        }

        return new SecurityUser(userInfoEntity);



    }
}
