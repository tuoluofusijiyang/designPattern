package com.Interview;

import com.Interview.packing.PackingTest;

/**
 * @program: test
 * @description: 封装结论测试--不同包
 * @author: Mr.Yang
 * @create: 2019-03-28 18:09
 **/
public class A extends PackingTest{
    public String getTongBaoProperties(){
        PackingTest packingTest = new PackingTest();
        System.out.println(packingTest.publicName);
        return null;
    }
}
