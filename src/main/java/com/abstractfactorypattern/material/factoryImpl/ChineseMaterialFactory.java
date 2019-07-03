package com.abstractfactorypattern.material.factoryImpl;

import com.abstractfactorypattern.material.factory.MaterialFactory;
import com.abstractfactorypattern.material.vo.Address;
import com.abstractfactorypattern.material.vo.ChineseAddress;

/**
 * @program: designPattern
 * @description: 中国的原材料工程
 * @author: Mr.Yang
 * @create: 2018-11-20 21:10
 **/
public class ChineseMaterialFactory implements MaterialFactory {

    @Override
    public Address selectAddress() {
        return new ChineseAddress();
    }
}
