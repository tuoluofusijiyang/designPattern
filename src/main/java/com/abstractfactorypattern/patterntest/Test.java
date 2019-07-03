package com.abstractfactorypattern.patterntest;

import com.abstractfactorypattern.breadstore.factory.BreadStoreFactory;
import com.abstractfactorypattern.breadstore.factoryImpl.ChinaStore;

/**
 * @program: designPattern
 * @description: 测试类
 * @author: Mr.Yang
 * @create: 2018-11-18 20:13
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("中国顾客买苹果味道面包");
        BreadStoreFactory chinaBreadStoreFactory = new ChinaStore();
        chinaBreadStoreFactory.orderBread("apple");
    }
}
