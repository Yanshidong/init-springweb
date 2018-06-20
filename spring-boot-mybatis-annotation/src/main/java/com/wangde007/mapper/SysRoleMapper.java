package com.wangde007.mapper;

import com.wangde007.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role")
    List<SysRoleEntity> getAll();

    @Select("<script>"
            + "SELECT "
            + "r.*"
            + "FROM sys_role r "
            + "LEFT JOIN sys_user_role ur ON ur.role_id = r.id "
            + "WHERE ur.uid = #{userid} "
            + "</script>")
    List<SysRoleEntity> getRolesByUserid(@Param("userid") Integer userid);
}
