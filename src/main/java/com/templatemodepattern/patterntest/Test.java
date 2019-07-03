package com.templatemodepattern.patterntest;

import com.templatemodepattern.parentclass.FruitJuiceParent;
import com.templatemodepattern.subclass.AppleFruitJuice;
import com.templatemodepattern.subclass.StrawberryFruitJuice;
import com.templatemodepattern.subclass.WatermelonFruitJuice;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2018-12-22 13:47
 **/
public class Test {
    public static void main(String[] args) {
        //创建苹果汁
        FruitJuiceParent appleFruitJuice = new AppleFruitJuice();
        System.out.println("____________苹果汁制作开始____________");
        appleFruitJuice.makeFruitJuice();
        System.out.println("____________苹果汁制作结束____________");
        System.out.println("\r\n");
        FruitJuiceParent strawberryFruitJuice = new StrawberryFruitJuice();
        System.out.println("____________草莓汁制作开始____________");
        strawberryFruitJuice.makeFruitJuice();
        System.out.println("____________草莓汁制作结束____________");
        System.out.println("\r\n");
        FruitJuiceParent watermelonFruitJuice = new WatermelonFruitJuice();
        System.out.println("____________西瓜汁制作____________");
        watermelonFruitJuice.makeFruitJuice();
        System.out.println("____________西瓜汁结束____________");
    }
}
