package com.designpattern.deckerpattern.patterntest;

import com.designpattern.deckerpattern.basicclass.Water;
import com.designpattern.deckerpattern.expandclass.AppleJuice;
import com.designpattern.deckerpattern.expandclass.MountainSpringWater;
import com.designpattern.deckerpattern.expandclass.OrangeJuice;
import com.designpattern.deckerpattern.expandclass.WellWater;

/**
 * @program: patterntest
 * @description: 测试装饰者类
 * @author: Mr.Yang
 * @create: 2018-11-12 23:01
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("A:我要一杯井水，我想尝尝");
        Water wellWater = new WellWater();
        System.out.println("服务员：这是 "+wellWater.getDescription()+" 价格是"+wellWater.getPrice());

        System.out.println("B:点一杯山泉水，兑橙子汁,再来个苹果汁，放一起，我试试味道");
        Water mountainSpringWater = new MountainSpringWater();
        mountainSpringWater=new OrangeJuice(mountainSpringWater);
        mountainSpringWater=new AppleJuice(mountainSpringWater);
        System.out.println("服务员：这是 "+mountainSpringWater.getDescription()+" 价格是"+mountainSpringWater.getPrice());



    }
}
