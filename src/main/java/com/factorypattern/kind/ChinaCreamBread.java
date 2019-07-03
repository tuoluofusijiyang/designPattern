package com.factorypattern.kind;

import com.factorypattern.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 中国奶油口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:48
 **/
public class ChinaCreamBread extends BreadFactory {
    public ChinaCreamBread(){
        name="中国奶油口味";
        type="2";
    }
    //可以重写父类方法，进行特殊处理
}
