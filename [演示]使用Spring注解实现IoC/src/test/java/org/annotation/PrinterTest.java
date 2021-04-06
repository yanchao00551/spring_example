package org.annotation;

import org.annotation.entity.User;
import org.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PackageName:com.springioc
 * @ClassName:PrinterTest
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 11:48
 * @email: 10947@163.com
 */
public class PrinterTest {

    @Test
    public void printerTest(){
        //通过ClassPathXmlApplicationContext实例化Spring的上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过ApplicationContext的getBean()方法，根据id获取bean的实例
        UserService userService = (UserService) context.getBean("userService");

        User user = new User();
        user.setId(1);
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@xxx.com");
        userService.addNewUser(user);
    }
}
