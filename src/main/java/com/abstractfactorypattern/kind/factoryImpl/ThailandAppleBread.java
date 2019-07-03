package com.abstractfactorypattern.kind.factoryImpl;

import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.material.factory.MaterialFactory;

/**
 * @program: designPattern
 * @description: 泰国苹果口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:49
 **/
public class ThailandAppleBread extends BreadFactory {
    MaterialFactory materialFactory;

    public ThailandAppleBread(MaterialFactory materialFactory){
        this.materialFactory=materialFactory;
        name="泰国苹果口味";
        type="5";
        toSelectAddress();
    }

    @Override
    protected void toSelectAddress() {
        address = materialFactory.selectAddress();
    }
    //可以重写父类方法，进行特殊处理
}
