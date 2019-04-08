package com.common.utils;

//常量类
public final class Constants {

    private Constants(){
    }

    //Session认证标识
    public static final String AUTHENTICATION_KEY = "SESSION_AUTHENTICATION";

    //管理员状态
    public enum AdminStatus{
        PENDING(0, "待定"),
        ACTIVE(1, "活跃的"),
        INACTIVE(2, "不活跃的"),
        DELETED(3, "删除的");

        private final Integer value;
        private final String name;

        private AdminStatus(Integer value, String name){
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
}
