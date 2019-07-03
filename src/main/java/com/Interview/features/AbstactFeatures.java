package com.Interview.features;

/**
 * @program: test
 * @description: 面相对象特征之一：抽象
 * 就是把现实世界中的某一类东西,提取出来,用程序代码表示,抽象出来的一般叫做类或者接口
 * 数据抽象：比如一盒蓝白沙，那么它的数据就是包装盒，烟，代码中指的就是属性
 * 过程/行为抽象:方法
 * @author: Mr.Yang
 * @create: 2019-03-28 17:50
 **/
public class AbstactFeatures {

    private String box;

    private String smoke;

    public String getBox() {
        return box;
    }

    public AbstactFeatures setBox(String box) {
        this.box = box;
        return this;
    }

    public String getSmoke() {
        return smoke;
    }

    public AbstactFeatures setSmoke(String smoke) {
        this.smoke = smoke;
        return this;
    }

    /**
     * 获取box的包装
     * @return
     */
    public String getBoxPacking(){
        return this.box;
    }
}
