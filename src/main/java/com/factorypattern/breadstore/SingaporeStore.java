package com.factorypattern.breadstore;

import com.factorypattern.factory.BreadFactory;
import com.factorypattern.kind.SingaporeAppleBread;
import com.factorypattern.kind.SingaporeCreamBread;

/**
 * @program: designPattern
 * @description: 新加坡店铺子类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:56
 **/
public class SingaporeStore extends BreadStoreFactory {
    @Override
    BreadFactory createBread(String type) {
        BreadFactory breadFactory=null;
        if("cream".equalsIgnoreCase(type)){
            System.out.println("创建新加坡奶油口味面包");
            breadFactory=new SingaporeCreamBread();
        }else if("apple".equalsIgnoreCase(type)){
            System.out.println("创建新加坡苹果口味面包");
            breadFactory=new SingaporeAppleBread();
        }else{
            System.out.println("无法确认的面包类型");
            return null;
        }
        return breadFactory;
    }
}
