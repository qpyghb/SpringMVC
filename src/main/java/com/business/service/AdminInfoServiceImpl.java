package com.business.service;

import com.business.bean.AdminInfo;
import com.business.dao.IAdminInfoDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminInfoService")
public class AdminInfoServiceImpl implements IAdminInfoService {

    @Resource
    private IAdminInfoDAO dao;

    public void add(AdminInfo info) {
        dao.add(info);
    }

    public AdminInfo findAdminInfoById(int id) {
        return dao.findAdminInfoById(id);
    }

    public AdminInfo getAdminInfo(String name, String password) {
        return dao.getAdminInfo(name, password);
    }
}
