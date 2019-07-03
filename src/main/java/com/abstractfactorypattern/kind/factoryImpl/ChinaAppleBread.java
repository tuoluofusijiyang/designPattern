package com.abstractfactorypattern.kind.factoryImpl;

import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.material.factory.MaterialFactory;

/**
 * @program: designPattern
 * @description: 中国苹果口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:48
 **/
public class ChinaAppleBread  extends BreadFactory {
    MaterialFactory materialFactory;

    public ChinaAppleBread(MaterialFactory materialFactory){
        name="中国苹果口味";
        type="1";
        this.materialFactory=materialFactory;
        toSelectAddress();
    }

    @Override
    protected void toSelectAddress() {
        address = materialFactory.selectAddress();
    }
    //可以重写父类方法，进行特殊处理
}
