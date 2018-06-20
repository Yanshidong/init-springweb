package com.wangde007.mapper;

import com.wangde007.entity.UserEntity;
import com.wangde007.entity.UserInfoEntity;
import com.wangde007.enums.UserInfoTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void getOneUserByTypeAndName(){
        UserInfoEntity userParam=new UserInfoEntity();
        userParam.setName("admin");
        userParam.setType(UserInfoTypeEnum.LOCAL);
        UserInfoEntity user=userInfoMapper.getUserByTypeAndName(userParam);
        System.out.println(user.toString());


    }
}
