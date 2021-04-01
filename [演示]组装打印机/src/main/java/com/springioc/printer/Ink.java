package com.springioc.printer;

/**
 * 墨盒接口
 * @Author 悟空
 * @Description //TODO
 * @Date 10:59 2021/4/1
 * @Param
 * @return
 **/
public interface Ink {

    /**
     * 定义打印采用的颜色的方法
     * @Author 悟空
     * @Description //TODO
     * @Date 11:00 2021/4/1
     * @Param [r, g, b] r红 g绿  b蓝
     * @return java.lang.String
     **/
    public String getColor(int r, int g, int b);
}
