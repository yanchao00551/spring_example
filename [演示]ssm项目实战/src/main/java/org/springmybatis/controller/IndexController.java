package org.springmybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
//将Model中的属性名为user的属性放入HttpSession对象当中
@SessionAttributes("user")
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

    @RequestMapping(value = "/index2",method = RequestMethod.GET,params = "myParam=myValue")
    public ModelAndView index2(){
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView index3(@RequestParam("loginname") String loginname,
                               @RequestParam(value = "password",required = false,defaultValue = "789") String password,
                               Model model){
        log.info("loginname:{}",loginname);
        log.info("password:{}",password);

        //假设已经登陆成功，将登陆成功信息放入session
        User user = new User();
        user.setLoginName("admin");
        user.setPassword("123456");
        model.addAttribute("user",user);
        return new ModelAndView("index");
    }


    @RequestMapping(value = "/index3/{userId}",method = RequestMethod.GET)
    public ModelAndView index3(@PathVariable Integer userId){
        log.info("userId:{}" ,userId);
        return new ModelAndView("index");
    }







}

