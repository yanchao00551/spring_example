package com.springioc;

import com.springioc.printer.Printer;
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
        Printer printer = (Printer) context.getBean("printer");
        //执行print()方法
        String content = "有一次看了一梦想家的节目，里面的那位主人公说：儿童摄影就是用相机记录孩子的成长。因为老公也喜欢摄影，我便对老公点评这句话说得好。接着我又问他：你没事时也喜欢咔嚓两下，你觉得怎样才算一个好的摄影师？没想到老公的几句话，让我有了一番不小的感悟。 他是这么说的：对于一个好的摄影师来说，技术是基础，最重要的是要有一颗发现美的眼睛。而有发现美的眼睛需要这个摄影师热爱生活。生活中到处都有美的风景，唯有热爱生活，才能善于发现生活中的美丽，也才能在瞬间构图出有创意与美感的片子出来。";
        printer.print(content);
    }
}
