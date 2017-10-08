package cn.happy.day02.printer;

import cn.happy.day02.ink.Ink;
import cn.happy.day02.paper.Paper;

/**
 * Created by LY on 2017/9/28.
 */
public class Print {
    private Ink ink;
    private Paper paper;
    public void print(){
        System.out.println("墨盒"+ink.getColor()+"纸张"+paper.getPaper()+"打印");

    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
