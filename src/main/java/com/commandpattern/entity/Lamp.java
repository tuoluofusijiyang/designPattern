package com.commandpattern.entity;

/**
 * @program: testpattern
 * @description: 灯的具体类
 * @author: Mr.Yang
 * @create: 2018-12-08 17:31
 **/
public class Lamp {
    private String name;

    /**
     * name为灯的具体装饰，即为哪里的灯
     * @param name
     */
    public  Lamp(String name){
        this.name=name;
    }
    public void  on (){
        System.out.println(name+"_灯打开");
    }
    public void off (){
        System.out.println(name+"_灯关闭");
    }
}
