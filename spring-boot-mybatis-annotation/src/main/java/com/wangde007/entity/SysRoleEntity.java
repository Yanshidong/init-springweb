package com.wangde007.entity;

public class SysRoleEntity {
    private Integer id;
    private Integer available;
    private String description;
    private String role;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }





//    @Override
//    public int compareTo(SysRoleEntity o) {
//        return 0;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        // TODO Auto-generated method stub
//        if(obj instanceof SysRoleEntity){
//            if(this.id == ((SysRoleEntity)obj).getId()){
//                return true;
//            }
//        }
//        return false;
//    }
    @Override
    public String toString(){
        return "role{"+
                "id="+id+
                ",avalibale="+available+
                ",descrition="+description+
                ",role"+role;

    }
}
