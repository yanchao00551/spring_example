package springioc;

import org.junit.Test;
import org.property.entity.TestEntity;
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
        TestEntity entity = (TestEntity) context.getBean("entity");
        System.out.println(entity);
    }
}
