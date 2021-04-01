package com.springioc.ink;

import com.springioc.printer.Ink;

import java.awt.*;

/**
 * 灰色墨盒。 实现Ink接口
 * @PackageName:com.springioc.ink
 * @ClassName:GreyInk
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 11:03
 * @email: 10947@163.com
 */
public class GreyInk implements Ink {

    /**
     * 打印采用灰色
     * @Author 悟空
     * @Description //TODO
     * @Date 11:07 2021/4/1
     * @Param [r, g, b]
     * @return java.lang.String
     **/
    @Override
    public String getColor(int r, int g, int b) {
        int c = (r + g + b) / 3;
        Color color = new Color(c,c,c);
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }

}
