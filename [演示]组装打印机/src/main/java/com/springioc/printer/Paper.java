package com.springioc.printer;

/**
 * 纸张接口
 * @Author 悟空
 * @Description //TODO
 * @Date 10:56 2021/4/1
 * @Param
 * @return
 **/
public interface Paper {
    public static final String newline = "\r\n";

    /**
     * 输出一个字符到纸张
     * @Author 悟空
     * @Description //TODO
     * @Date 10:57 2021/4/1
     * @Param [c]
     * @return void
     **/
    void putInChar(char c);


    /**
     * 得到输出到纸张上的内容
     * @Author 悟空
     * @Description //TODO
     * @Date 10:57 2021/4/1
     * @Param []
     * @return java.lang.String
     **/
     String getContext();


}
