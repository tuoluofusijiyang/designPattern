package com.abstractfactorypattern.breadstore.factoryImpl;

import com.abstractfactorypattern.breadstore.factory.BreadStoreFactory;
import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.kind.factoryImpl.ThailandAppleBread;
import com.abstractfactorypattern.material.factory.MaterialFactory;
import com.abstractfactorypattern.material.factoryImpl.ThailandMaterialFactory;

/**
 * @program: designPattern
 * @description: 泰国店铺子类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:56
 **/
public class ThailandStore extends BreadStoreFactory {
    @Override
    public BreadFactory createBread(String type) {
        BreadFactory breadFactory=null;
        MaterialFactory thailandMaterialFactory = new ThailandMaterialFactory();
        if("cream".equalsIgnoreCase(type)){
            System.out.println("创建泰国奶油口味面包");
            breadFactory=new ThailandAppleBread(thailandMaterialFactory);
        }else if("apple".equalsIgnoreCase(type)){
            System.out.println("创建泰国苹果口味面包");
            breadFactory=new ThailandAppleBread(thailandMaterialFactory);
        }else{
            System.out.println("无法确认的面包类型");
            return null;
        }
        return breadFactory;
    }
}
