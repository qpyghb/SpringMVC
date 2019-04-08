package com.business.controller;

import com.business.bean.AdminInfo;
import com.business.service.IAdminInfoService;
import com.common.utils.Constants;
import com.common.utils.TimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("")
public class AdminInfoController {

    @Resource
    private IAdminInfoService service;

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        AdminInfo info = this.service.getAdminInfo(name, password);

        ModelAndView model = new ModelAndView();

        if (null != info && Constants.AdminStatus.ACTIVE.getValue() == info.getStatus()) {
            //保存登录Session
            request.getSession().setAttribute(Constants.AUTHENTICATION_KEY, info);

            model.setViewName("/admin");
            model.addObject("adminInfo", info);

            System.out.println("登录成功 ： name : " + name + "Time : " + TimeUtil.getFullDateString());
        } else {

            model.addObject("message", "登录失败");
            model.setViewName("admin/login");
        }
        return model;
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        request.getSession().removeAttribute(Constants.AUTHENTICATION_KEY);
        return new ModelAndView("admin/login");
    }

    @RequestMapping("/findAdminInfoById")
    public String indAdminInfoById(Model model) {
        int id = 1;
        AdminInfo adminInfo = this.service.findAdminInfoById(id);
        model.addAttribute("adminInfo", adminInfo);
        return "index";
    }

}
