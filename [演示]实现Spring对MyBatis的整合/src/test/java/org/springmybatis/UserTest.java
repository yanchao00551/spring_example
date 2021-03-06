package org.springmybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springmybatis.pojo.User;
import org.springmybatis.service.UserService;

import java.text.ParseException;
import java.util.List;

/**
 * @PackageName:org.springmybatis
 * @ClassName:UserTest
 * @Description:
 * @author: 悟空
 * @date: 2021/4/7 10:55
 * @email: 10947@163.com
 */
@Slf4j
public class UserTest {


    @Test
    public void test(){
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        User userCondition = new User();
        userCondition.setLoginName("n");
        List<User> list = userService.findUsersByCondition(userCondition);



        //java 8新特性
        list.forEach((value) -> log.info("每行的内容：{}",value));
    }

    @Test
    public void testAddNewUser() throws ParseException{
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        User skeyeduUser = new User();
        skeyeduUser.setUserName("测试插入");
        skeyeduUser.setLoginName("zhao7");
        skeyeduUser.setPassword("helloworld");
        skeyeduUser.setSex(0);
        skeyeduUser.setIdentityCode("4032020302");
        skeyeduUser.setEmail("7631990@qq.com");
        skeyeduUser.setMobile("13242232443");
        skeyeduUser.setType(1);

        boolean result = userService.addNewUser(skeyeduUser);
        log.info("testAdd result: " + result);

    }
}
