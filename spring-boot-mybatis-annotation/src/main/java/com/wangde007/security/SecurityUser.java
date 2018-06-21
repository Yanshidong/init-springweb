package com.wangde007.security;

import com.wangde007.defines.DefineUserInfoState;
import com.wangde007.defines.DefineUserInfoState;
import com.wangde007.entity.SysRoleEntity;
import com.wangde007.entity.UserInfoEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecurityUser implements UserDetails {
    private UserInfoEntity userInfoEntity;
    public SecurityUser(UserInfoEntity userInfoEntity) {
        this.userInfoEntity=userInfoEntity;
    }

    /**
     * Returns the authorities granted to the user. Cannot return <code>null</code>.
     *
     * @return the authorities, sorted by natural key (never <code>null</code>)
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        // 根据自定义逻辑来返回用户权限，如果用户权限返回空或者和拦截路径对应权限不同，验证不通过
        if(!userInfoEntity.getRolelist().isEmpty()){
            List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
            for (SysRoleEntity role:userInfoEntity.getRolelist()){
                //权限列表压入的是名字？，诡异
                GrantedAuthority au = new SimpleGrantedAuthority(role.getRole());
                list.add(au);
            }

            return list;
        }
        return null;
    }

    /**
     * Returns the password used to authenticate the user.
     *
     * @return the password
     */
    @Override
    public String getPassword() {
        return userInfoEntity.getPassword();
    }

    /**
     * Returns the username used to authenticate the user. Cannot return <code>null</code>
     * .
     *
     * @return the username (never <code>null</code>)
     */
    @Override
    public String getUsername() {
        return userInfoEntity.getName();
    }

    /**
     * Indicates whether the user's account has expired. An expired account cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user's account is valid (ie non-expired),
     * <code>false</code> if no longer valid (ie expired)
     */
    @Override
    public boolean isAccountNonExpired() {

        return !(userInfoEntity.getState().equals(DefineUserInfoState.EXPIRED));
    }

    /**
     * Indicates whether the user is locked or unlocked. A locked user cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user is not locked, <code>false</code> otherwise
     */
    @Override
    public boolean isAccountNonLocked() {
        return !(userInfoEntity.getState().equals(DefineUserInfoState.LOCKED));
    }

    /**
     * Indicates whether the user's credentials (password) has expired. Expired
     * credentials prevent authentication.
     *
     * @return <code>true</code> if the user's credentials are valid (ie non-expired),
     * <code>false</code> if no longer valid (ie expired)
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * Indicates whether the user is enabled or disabled. A disabled user cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user is enabled, <code>false</code> otherwise
     */
    @Override
    public boolean isEnabled() {
        return !(userInfoEntity.getState().equals(DefineUserInfoState.DISABLED));
    }
}
