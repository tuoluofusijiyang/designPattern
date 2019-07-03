package com.abstractfactorypattern.material.factoryImpl;

import com.abstractfactorypattern.material.factory.MaterialFactory;
import com.abstractfactorypattern.material.vo.Address;
import com.abstractfactorypattern.material.vo.ThailandAddress;

/**
 * @program: designPattern
 * @description: 泰国的原材料工程
 * @author: Mr.Yang
 * @create: 2018-11-20 21:12
 **/
public class ThailandMaterialFactory implements MaterialFactory {

    @Override
    public Address selectAddress() {
        return new ThailandAddress();
    }
}
