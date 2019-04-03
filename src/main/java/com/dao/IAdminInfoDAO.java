package com.dao;

import com.bean.AdminInfo;
import org.apache.ibatis.annotations.Param;

public interface IAdminInfoDAO {

    public void add(AdminInfo info);

    public AdminInfo findAdminInfoById(@Param("id") int id);

    public AdminInfo getAdminInfo(@Param("name") String name, @Param("password") String password);
}
