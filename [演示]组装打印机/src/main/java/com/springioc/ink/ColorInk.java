package com.springioc.ink;

import com.springioc.printer.Ink;

import java.awt.*;

/**
 * @PackageName:com.springioc.ink
 * @ClassName:ColorInk
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 11:07
 * @email: 10947@163.com
 */
public class ColorInk implements Ink {

    /**
     * 打印采用彩色
     * @Author 悟空
     * @Description //TODO
     * @Date 11:08 2021/4/1
     * @Param [r, g, b]
     * @return java.lang.String
     **/
    @Override
    public String getColor(int r, int g, int b) {
        Color color = new Color(r,g,b);
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
