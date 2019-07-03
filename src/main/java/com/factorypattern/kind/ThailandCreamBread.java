package com.factorypattern.kind;

import com.factorypattern.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 泰国奶油面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:49
 **/
public class ThailandCreamBread extends BreadFactory {
    public ThailandCreamBread(){
        name="泰国奶油口味";
        type="6";
    }
    //可以重写父类方法，进行特殊处理
}
