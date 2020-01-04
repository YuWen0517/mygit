package com.xr.demo.controller;


import com.xr.demo.model.User;
import com.xr.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public ModelAndView query(){
        List<User> users=userService.queryAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("users",users);
        mv.setViewName("success");
        return  mv;
    }
}
