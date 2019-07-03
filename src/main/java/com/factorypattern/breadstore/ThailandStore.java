package com.factorypattern.breadstore;

import com.factorypattern.factory.BreadFactory;
import com.factorypattern.kind.ThailandAppleBread;

/**
 * @program: designPattern
 * @description: 泰国店铺子类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:56
 **/
public class ThailandStore extends BreadStoreFactory {
    @Override
    BreadFactory createBread(String type) {
        BreadFactory breadFactory=null;
        if("cream".equalsIgnoreCase(type)){
            System.out.println("创建泰国奶油口味面包");
            breadFactory=new ThailandAppleBread();
        }else if("apple".equalsIgnoreCase(type)){
            System.out.println("创建泰国苹果口味面包");
            breadFactory=new ThailandAppleBread();
        }else{
            System.out.println("无法确认的面包类型");
            return null;
        }
        return breadFactory;
    }
}
