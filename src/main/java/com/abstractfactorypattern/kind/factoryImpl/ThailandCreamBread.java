package com.abstractfactorypattern.kind.factoryImpl;

import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.material.factory.MaterialFactory;

/**
 * @program: designPattern
 * @description: 泰国奶油面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:49
 **/
public class ThailandCreamBread extends BreadFactory {
    MaterialFactory materialFactory;

    public ThailandCreamBread(MaterialFactory materialFactory){
        this.materialFactory=materialFactory;
        name="泰国奶油口味";
        type="6";
        toSelectAddress();
    }

    @Override
    protected void toSelectAddress() {
        address = materialFactory.selectAddress();
    }
    //可以重写父类方法，进行特殊处理
}
