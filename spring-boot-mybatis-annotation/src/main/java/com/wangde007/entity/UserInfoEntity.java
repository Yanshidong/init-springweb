package com.wangde007.entity;

import com.wangde007.enums.UserInfoTypeEnum;

import java.util.List;


public class UserInfoEntity{

    private Integer id;
    private String name;
    private UserInfoTypeEnum type;
    private String salt;
    private Integer state;
    private String username;
    private String phone;
    private String email;
    private String createAt;
    private String loginAt;
    private Integer loginCount;
    private String password;

    private List<SysRoleEntity> rolelist;

    public List<SysRoleEntity> getRolelist() {
        return rolelist;
    }

    public void setRolelist(List<SysRoleEntity> rolelist) {
        this.rolelist = rolelist;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfoTypeEnum getType() {
        return type;
    }

    public void setType(UserInfoTypeEnum type) {
        this.type = type;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(String loginAt) {
        this.loginAt = loginAt;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", salt='" + salt + '\'' +
                ", state=" + state +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createAt='" + createAt + '\'' +
                ", loginAt='" + loginAt + '\'' +
                ", loginCount=" + loginCount +'\''+
                ", rolelist=" + rolelist.toString()+
                '}';
    }


}
