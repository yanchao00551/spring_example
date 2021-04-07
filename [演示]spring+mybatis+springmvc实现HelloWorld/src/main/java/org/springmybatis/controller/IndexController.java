package org.springmybatis.controller;

import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

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
public class IndexController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello,SpringMVC");
        return new ModelAndView("index");
    }


}
