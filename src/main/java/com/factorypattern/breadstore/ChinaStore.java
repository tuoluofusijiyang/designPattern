package com.factorypattern.breadstore;

import com.factorypattern.factory.BreadFactory;
import com.factorypattern.kind.ChinaAppleBread;
import com.factorypattern.kind.ChinaCreamBread;

/**
 * @program: designPattern
 * @description: 中国店铺子类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:55
 **/
public class ChinaStore extends BreadStoreFactory{
    @Override
    BreadFactory createBread(String type) {
        BreadFactory breadFactory=null;
        if("cream".equalsIgnoreCase(type)){
            System.out.println("创建中国奶油口味面包");
            breadFactory=new ChinaCreamBread();
        }else if("apple".equalsIgnoreCase(type)){
            System.out.println("创建中国苹果口味面包");
            breadFactory=new ChinaAppleBread();
        }else{
            System.out.println("无法确认的面包类型");
            return null;
        }
        return breadFactory;
    }
}
