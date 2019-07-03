package com.adapterpattern.adapter;

import com.adapterpattern.dog.Dog;
import com.adapterpattern.rabbit.Rabbit;

/**
 * @program: test
 * @description: 缺兔子对象，适配器负责将狗类充当为兔子类
 * @author: Mr.Yang
 * @create: 2018-12-15 16:21
 **/
public class ActAsRabbitAdapter implements Rabbit {
    Dog dog;

    public ActAsRabbitAdapter(Dog dog){
        this.dog=dog;
    }

    /**
     * 外部还是调用兔子的方法，内部的实现是狗的跳,狗需要跳两次才和兔子跳的距离一样
     */
    public void jump() {
        dog.jump();
        dog.jump();
    }
    /**
     * 外部还是调用兔子叫的方法，内部的实现是狗的叫
     */
    public void coo() {
        dog.bark();
    }
}
