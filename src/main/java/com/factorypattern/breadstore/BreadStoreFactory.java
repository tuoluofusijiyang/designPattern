package com.factorypattern.breadstore;

import com.factorypattern.factory.BreadFactory;

/**
 * @program: designPattern
 * @description: 面包商店抽象类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:51
 **/
public abstract class BreadStoreFactory {

    public BreadFactory orderBread(String type) {
        return createBread(type)
                .stir()
                .rubbingRound()
                .machining()
                .bake();
    }

    abstract BreadFactory createBread(String type);
}
