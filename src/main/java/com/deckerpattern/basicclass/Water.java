package com.deckerpattern.basicclass;

/**
 * @program: patterntest
 * @description: 饮料抽象类，作为最底层的抽象类，所有加工料都必须继承此类
 * @author: Mr.Yang
 * @create: 2018-11-12 22:35
 **/
public abstract class Water {
    public String description="水";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //得到价格
    public abstract double getPrice();
}
