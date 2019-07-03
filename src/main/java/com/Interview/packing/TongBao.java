package com.Interview.packing;

/**
 * @program: test
 * @description: 娃儿
 * @author: Mr.Yang
 * @create: 2019-03-28 18:08
 **/
public class TongBao {

    public String getTongBaoProperties(){
        PackingTest packingTest = new PackingTest();
        System.out.println(packingTest.defaultName);
        System.out.println(packingTest.publicName);
        System.out.println(packingTest.protectedName);
        return null;
    }

}
