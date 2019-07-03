package com.abstractfactorypattern.breadstore.factory;

import com.abstractfactorypattern.kind.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 面包商店抽象类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:51
 **/
public abstract class BreadStoreFactory {

    public BreadFactory orderBread(String type) {
        BreadFactory bread = createBread(type);
        System.out.println("材料耗尽");
        System.out.println(bread.address.name+"_拿到材料");
        return   bread.stir()
                .rubbingRound()
                .machining()
                .bake();
    }

    public abstract BreadFactory createBread(String type);
}
