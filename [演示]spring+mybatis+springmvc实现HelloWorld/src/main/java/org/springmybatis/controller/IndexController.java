package org.springmybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;
import org.springmybatis.pojo.User;
import org.springmybatis.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping(value = "/home")
@Slf4j
public class IndexController {

    @Autowired
    private UserService userService;


    @RequestMapping( value = "/index",method = RequestMethod.GET)
    public ModelAndView index(){
        User user = new User();
        user.setLoginName("n");
        List<User> users = userService.findUsersByCondition(user);
        users.forEach((value) -> log.info("每行的内容：{}",value));
        ModelAndView view = new ModelAndView("index");
        view.addObject("list",users);
        return view;
    }





}

