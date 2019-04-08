package com.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/admin")
public class IndexController extends BaseController {

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("now", new Date());

        return "/admin/index";
    }

}
