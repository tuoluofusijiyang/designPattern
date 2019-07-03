package com.factorypattern.kind;

import com.factorypattern.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 新加坡奶油口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:50
 **/
public class SingaporeCreamBread extends BreadFactory {
    public SingaporeCreamBread(){
        name="新加坡奶油口味";
        type="4";
    }
    //可以重写父类方法，进行特殊处理
}
