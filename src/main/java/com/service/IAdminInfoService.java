package com.service;

import com.bean.AdminInfo;

public interface IAdminInfoService {

    public void add(AdminInfo info);

    public AdminInfo findAdminInfoById(int id);

    public AdminInfo getAdminInfo(String name, String password);
}
