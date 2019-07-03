package com.abstractfactorypattern.kind.factoryImpl;

import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.material.factory.MaterialFactory;

/**
 * @program: designPattern
 * @description: 新加坡奶油口味面包
 * @author: Mr.Yang
 * @create: 2018-11-18 19:50
 **/
public class SingaporeCreamBread extends BreadFactory {
    MaterialFactory materialFactory;

    public SingaporeCreamBread(MaterialFactory materialFactory){
        this.materialFactory=materialFactory;
        name="新加坡奶油口味";
        type="4";
        toSelectAddress();
    }

    @Override
    protected void toSelectAddress() {
        address = materialFactory.selectAddress();
    }
    //可以重写父类方法，进行特殊处理
}