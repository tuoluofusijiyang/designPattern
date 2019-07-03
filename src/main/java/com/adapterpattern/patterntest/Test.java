package com.adapterpattern.patterntest;

import com.adapterpattern.adapter.ActAsRabbitAdapter;
import com.adapterpattern.dog.Dog;
import com.adapterpattern.dog.LittleBlackDog;
import com.adapterpattern.rabbit.LittleWhiteRabbit;
import com.adapterpattern.rabbit.Rabbit;

/**
 * @program: test
 * @description: 适配器模式测试类
 * @author: Mr.Yang
 * @create: 2018-12-15 16:26
 **/
public class Test {
    /**
     * 负责执行鸭子的跳与叫
     * @param rabbit
     */
    public static  void testRabbit(Rabbit rabbit){
        rabbit.jump();
        rabbit.coo();
    }
    /**
     * 负责执行狗的跳与叫
     * @param dog
     */
    public static void testDog(Dog dog){
        dog.jump();
        dog.bark();
    }

    public static void main(String[] args) {
        //创建一个兔子类
        Rabbit rabbit = new LittleWhiteRabbit();
        //创建一个狗类
        Dog dog = new LittleBlackDog();
        //创建一个适配器，包装狗类，为兔子类
        Rabbit adapterRabbit = new ActAsRabbitAdapter(dog);

        System.out.println("----------------------小白兔的跳与叫--------------------");
        testRabbit(rabbit);

        System.out.println("----------------------小黑狗的跳与叫--------------------");
        testDog(dog);

        System.out.println("----------------------适配器（相等于兔子）的跳与叫--------------------");
        //适配实现了兔子接口，所以可以别认为是个兔子，testRabbit()这个方法并不知道这个是适配器
        testRabbit(adapterRabbit);
    }
}
