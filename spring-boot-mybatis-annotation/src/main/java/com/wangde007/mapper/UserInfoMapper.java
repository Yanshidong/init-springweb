package com.wangde007.mapper;

import com.wangde007.entity.UserInfoEntity;
import com.wangde007.enums.UserInfoTypeEnum;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInfoMapper {

    @Select("SELECT * FROM `user_info` where `name`= #{name} and `type`= #{type}")
    @Results({
            @Result(property = "type",column = "type",javaType =UserInfoTypeEnum.class),
            @Result(property = "createAt",column = "create_at"),
            @Result(property = "loginAt",column = "login_at"),
            @Result(property = "loginCount",column = "login_count"),
            @Result(property = "rolelist",column = "id",javaType = List.class,
            many = @Many(select = "com.wangde007.mapper.SysRoleMapper.getRolesByUserid")
            )
    })
    UserInfoEntity getUserByTypeAndName(UserInfoEntity userInfoEntity);

    @Select("SELECT * FROM `user_info` where `phone`= #{phone} and `type`=#{type}")
    UserInfoEntity getUserByTypeAndPhone(UserInfoEntity userInfoEntity);

    @Select("SELECT * FROM `user_info` where `email`=#{email} and `type`=#{type}")
    UserInfoEntity getUserByTypeAndEmail(UserInfoEntity userInfoEntity);

}
