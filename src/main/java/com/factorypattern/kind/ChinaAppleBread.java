package com.factorypattern.kind;

import com.factorypattern.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 中国苹果口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:48
 **/
public class ChinaAppleBread  extends BreadFactory {
    public ChinaAppleBread(){
        name="中国苹果口味";
        type="1";
    }
    //可以重写父类方法，进行特殊处理
}
