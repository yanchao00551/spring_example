package com.springdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PackageName:com.springdemo
 * @ClassName:HelloSpringTest
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 10:14
 * @email: 10947@163.com
 */
public class HelloSpringTest {


    @Test
    public void helloSpring(){
        //通过ClassPathXmlApplicationContext实例化Spring的上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过ApplicationContext的getBean()方法，根据id获取bean的实例
        HelloSpring helloSpring = (HelloSpring)context.getBean("helleSpring");
        //执行print()方法
        helloSpring.print();
    }
}
