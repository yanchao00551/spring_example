package org.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;
import org.springmybatis.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @PackageName:org.springmybatis.controller
 * @ClassName:IndexController
 * @Description:
 * @author: 悟空
 * @date: 2021/4/7 15:32
 * @email: 10947@163.com
 */

/**
 * 控制器默认单例，非线程安全
 * @author 悟空
 * @description //TODO
 * @date 10:06 2021/4/8
 * @param null
 * @return null
 */
@RestController
@RequestMapping("/home")
public class IndexController {

    private int i = 0;

    @RequestMapping("/index")
    public Integer index(){
        return i++;
    }

    @RequestMapping("/index2")
    public Integer index2(){
        return i++;
    }
}

