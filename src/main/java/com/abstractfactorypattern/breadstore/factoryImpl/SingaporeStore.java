package com.abstractfactorypattern.breadstore.factoryImpl;

import com.abstractfactorypattern.breadstore.factory.BreadStoreFactory;
import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.kind.factoryImpl.SingaporeAppleBread;
import com.abstractfactorypattern.kind.factoryImpl.SingaporeCreamBread;
import com.abstractfactorypattern.material.factory.MaterialFactory;
import com.abstractfactorypattern.material.factoryImpl.SingaporeMaterialFactory;

/**
 * @program: designPattern
 * @description: 新加坡店铺子类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:56
 **/
public class SingaporeStore extends BreadStoreFactory {
    @Override
    public BreadFactory createBread(String type) {
        BreadFactory breadFactory=null;
        MaterialFactory singaporeMaterialFactory = new SingaporeMaterialFactory();
        if("cream".equalsIgnoreCase(type)){
            System.out.println("创建新加坡奶油口味面包");
            breadFactory=new SingaporeCreamBread(singaporeMaterialFactory);
        }else if("apple".equalsIgnoreCase(type)){
            System.out.println("创建新加坡苹果口味面包");
            breadFactory=new SingaporeAppleBread(singaporeMaterialFactory);
        }else{
            System.out.println("无法确认的面包类型");
            return null;
        }
        return breadFactory;
    }
}
