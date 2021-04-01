package com.springdemo;

/**
 * 第一个Spring，输出“Hello,Spring!"
 * @PackageName:com.springdemo
 * @ClassName:HelloSpring
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 9:33
 * @email: 10947@163.com
 */
public class HelloSpring {


    /**
     * 定义who属性，该属性的值将通过Spring框架进行设置
     * @Author 悟空
     * @Description //TODO
     * @Date 9:34 2021/4/1
     * @Param
     * @return
     **/
    private String who = null;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public void print(){
        System.out.println("Hello," + this.getWho() + "!");
    }

}
