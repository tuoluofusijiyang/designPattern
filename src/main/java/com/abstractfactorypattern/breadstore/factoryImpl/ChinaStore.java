package com.abstractfactorypattern.breadstore.factoryImpl;

import com.abstractfactorypattern.breadstore.factory.BreadStoreFactory;
import com.abstractfactorypattern.kind.factory.BreadFactory;
import com.abstractfactorypattern.kind.factoryImpl.ChinaAppleBread;
import com.abstractfactorypattern.kind.factoryImpl.ChinaCreamBread;
import com.abstractfactorypattern.material.factoryImpl.ChineseMaterialFactory;
import com.abstractfactorypattern.material.factory.MaterialFactory;

/**
 * @program: designPattern
 * @description: 中国店铺子类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:55
 **/
public class ChinaStore extends BreadStoreFactory {
    @Override
    public BreadFactory createBread(String type) {
        BreadFactory breadFactory=null;
        MaterialFactory chineseMaterialFactory = new ChineseMaterialFactory();
        if("cream".equalsIgnoreCase(type)){
            System.out.println("创建中国奶油口味面包");
            breadFactory=new ChinaCreamBread(chineseMaterialFactory);
        }else if("apple".equalsIgnoreCase(type)){
            System.out.println("创建中国苹果口味面包");
            breadFactory=new ChinaAppleBread(chineseMaterialFactory);
        }else{
            System.out.println("无法确认的面包类型");
            return null;
        }
        return breadFactory;
    }
}
