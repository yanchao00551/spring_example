package com.springioc.paper;


import com.springioc.printer.Paper;
/**
 * @PackageName:com.springioc.paper
 * @ClassName:TextPager
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 11:09
 * @email: 10947@163.com
 */
public class TextPager implements Paper {

    /**
     * 每行字符数
     * @Author 悟空
     * @Description //TODO
     * @Date 11:11 2021/4/1
     * @Param
     * @return
     **/
    private int charPerLine = 16;

    /**
     * 每页行数
     * @Author 悟空
     * @Description //TODO
     * @Date 11:11 2021/4/1
     * @Param
     * @return
     **/
    private int linePerPage = 5;

    /**
     * 纸张中内容
     * @Author 悟空
     * @Description //TODO
     * @Date 11:12 2021/4/1
     * @Param
     * @return
     **/
    private String content = "";

    /**
     * 当前横向位置，从0到charPerLine0-1
     * @Author 悟空
     * @Description //TODO
     * @Date 11:13 2021/4/1
     * @Param
     * @return
     **/
    private int posX = 0;

    /**
     * 当前行数，从0到 linePerPage-1
     * @Author 悟空
     * @Description //TODO
     * @Date 11:15 2021/4/1
     * @Param
     * @return
     **/
    private int posY = 0;

    /**
     * 当前页数
     * @Author 悟空
     * @Description //TODO
     * @Date 11:15 2021/4/1
     * @Param
     * @return
     **/
    private int posP = 1;



    @Override
    public void putInChar(char c) {
        content += c;
        ++posX;
        //判断是否换行
        if(posX == charPerLine){
            content += Paper.newline;
            posX = 0;
            ++posY;
        }
        //判断是否翻页
        if(posY == linePerPage){
            content += "-- 第" + posP + "页--";
            content += Paper.newline + Paper.newline;
            posY = 0;
            ++posP;
        }
    }

    @Override
    public String getContext() {
        String res = this.content;
        //补齐本页空行，并显示页码
        if(!(posX == 0 && posY == 0)){
            int count = linePerPage - posY;
            for(int i = 0; i < count; ++i){
                res += Paper.newline;
            }
            res += "-- 第" + posP + "页 --";
        }
        return res;
    }




    public void setCharPerLine(int charPerLine) {
        this.charPerLine = charPerLine;
    }

    public void setLinePerPage(int linePerPage) {
        this.linePerPage = linePerPage;
    }
}
