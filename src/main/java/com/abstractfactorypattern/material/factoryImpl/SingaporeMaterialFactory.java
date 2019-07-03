package com.abstractfactorypattern.material.factoryImpl;

import com.abstractfactorypattern.material.factory.MaterialFactory;
import com.abstractfactorypattern.material.vo.Address;
import com.abstractfactorypattern.material.vo.SignaporeAddress;

/**
 * @program: designPattern
 * @description: 新加坡的原材料工程
 * @author: Mr.Yang
 * @create: 2018-11-20 21:11
 **/
public class SingaporeMaterialFactory implements MaterialFactory {
    @Override
    public Address selectAddress() {
        return new SignaporeAddress();
    }
}
