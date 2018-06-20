package com.wangde007.mapper;

import com.wangde007.entity.SysRoleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysRoleMapperTest {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Test
    public void getUsersRoleByUserid()
    {
        List<SysRoleEntity> roleList=sysRoleMapper.getRolesByUserid(2);
        System.out.println(roleList.toString());
    }
}
