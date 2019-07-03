package com.adapterpattern.rabbit;

/**
 * @program: test
 * @description: 小白兔类，实现兔子接口的具体类
 * @author: Mr.Yang
 * @create: 2018-12-15 16:16
 **/
public class LittleWhiteRabbit implements Rabbit{

    public void jump() {
        System.out.println("小白兔，跳2米");
    }

    public void coo() {
        System.out.println("小白兔，在咕咕叫");
    }
}
