package com.controller;

import com.bean.AdminInfo;
import com.service.IAdminInfoService;
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
    public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        AdminInfo info = this.service.getAdminInfo(name, password);

        ModelAndView model = new ModelAndView();

        if (null == info) {
            System.out.println("登录错误 ： name : " + name + " password : " + password);
            model.setViewName("login_fail");
        } else {
            model.setViewName("login_success");
            model.addObject("adminInfo", info);
        }
        return model;
    }

    @RequestMapping("/findAdminInfoById")
    public String FindAdminInfoById(Model model) {
        int id = 1;
        AdminInfo adminInfo = this.service.findAdminInfoById(id);
        model.addAttribute("adminInfo", adminInfo);
        return "index";
    }

}
