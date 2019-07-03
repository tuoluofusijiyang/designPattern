package com.adapterpattern.dog;

/**
 * @program: test
 * @description: 小黑狗，实现了狗接口的具体类
 * @author: Mr.Yang
 * @create: 2018-12-15 16:19
 **/
public class LittleBlackDog implements Dog{

    public void jump() {
        System.out.println("小黑狗，跳一米");
    }

    public void bark() {
        System.out.println("小黑狗，汪汪的叫");
    }
}
