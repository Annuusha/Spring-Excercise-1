package com.stackroute.controller;

import com.stackroute.appconfig.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/method")
    public ModelAndView method(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
       String name = httpServletRequest.getParameter("name");
        User user = new User(name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("result",user.getName());
        return modelAndView;
    }
}
