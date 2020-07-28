package com.designpattern.deckerpattern.expandclass;

import com.designpattern.deckerpattern.basicclass.Water;

/**
 * @program: patterntest
 * @description: 山泉水，属于水的一种
 * @author: Mr.Yang
 * @create: 2018-11-12 22:44
 **/
public class MountainSpringWater extends Water {
    //属于山泉水的描述
    private final static String name ="山泉水";
    //山泉水的对外成本价格
    private final static double basicPrice=1.2;

    //山泉水，需要属于自己的描述
    public MountainSpringWater(){
        description=name;
    }

    public double getPrice() {
        return basicPrice;
    }
}
