package com.deckerpattern.expandclass;

import com.deckerpattern.basicclass.FruitJuice;
import com.deckerpattern.basicclass.Water;

import java.math.BigDecimal;

/**
 * @program: patterntest
 * @description: 橙子汁，果汁的一种,装饰者的实现类，继承果汁抽象类，
 * @author: Mr.Yang
 * @create: 2018-11-12 22:52
 **/
public class OrangeJuice extends FruitJuice {

    //橙子汁的描述
    private final static String name="橙子汁";

    //橙子汁的对外成本价
    private final static double orangePrice=3.2;

    //让水(被装饰者)记录到变量中
    Water water;

    public OrangeJuice(Water water){
        this.water=water;
    }

    public String getDescription() {
        return water.getDescription()+"  "+name;
    }

    public double getPrice() {
        //先得到成本价,使用double，可能会有精度丢失的情况，bigDecimal的构造方法中最好传入，String类型的数字字符串
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(orangePrice));
        //成本价，加上水的价格
        BigDecimal afterPrice = bigDecimal.add(new BigDecimal(String.valueOf(water.getPrice())));
        return afterPrice.doubleValue();
    }
}
