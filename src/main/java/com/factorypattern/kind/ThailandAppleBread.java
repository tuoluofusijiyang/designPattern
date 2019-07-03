package com.factorypattern.kind;

import com.factorypattern.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 泰国苹果口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:49
 **/
public class ThailandAppleBread extends BreadFactory {
    public ThailandAppleBread(){
        name="泰国苹果口味";
        type="5";
    }
    //可以重写父类方法，进行特殊处理
}
