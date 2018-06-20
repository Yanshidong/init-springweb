package com.wangde007.entity;

import com.wangde007.enums.PermissionResourceTypeEnum;

import java.math.BigInteger;

public class PermissionEntity {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte getAvailable() {
        return available;
    }

    public void setAvailable(byte available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getParent_id() {
        return parent_id;
    }

    public void setParent_id(BigInteger parent_id) {
        this.parent_id = parent_id;
    }

    public String getParent_ids() {
        return parent_ids;
    }

    public void setParent_ids(String parent_ids) {
        this.parent_ids = parent_ids;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public PermissionResourceTypeEnum getResource_type() {
        return resource_type;
    }

    public void setResource_type(PermissionResourceTypeEnum resource_type) {
        this.resource_type = resource_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private Integer id;
    private byte available;
    private String name;
    private BigInteger parent_id;
    private String parent_ids;
    private String permission;
    private PermissionResourceTypeEnum resource_type;
    private String url;
    @Override
    public String toString(){
        return "Permission{"+
                "id="+id+
                ",avalibal="+available+
                ",name="+name+
                ",parent_id="+parent_id+
                ",parent_ids="+parent_ids+
                ",permiission="+permission+
                ",resource_type="+resource_type+
                ",url="+url;
    }
}
