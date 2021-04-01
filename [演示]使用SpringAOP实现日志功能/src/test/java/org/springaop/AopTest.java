package org.springaop;

import org.junit.Test;
import org.springaop.entity.User;
import org.springaop.service.UserService;
import org.springaop.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PackageName:org.springaop
 * @ClassName:AopTest
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 15:36
 * @email: 10947@163.com
 */
public class AopTest {


    @Test
    public void aopTest(){
        //通过ClassPathXmlApplicationContext实例化Spring的上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过ApplicationContext的getBean()方法，根据id获取bean的实例
        UserService userService = (UserService) context.getBean("userService");
        //执行print()方法
        User user = new User();
        user.setId(1);
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@xxx.com");
        userService.addNewUser(user);
    }


}
