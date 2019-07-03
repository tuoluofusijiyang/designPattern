package com.commandpattern.entity;

/**
 * @program: testpattern
 * @description: 电视的具体类
 * @author: Mr.Yang
 * @create: 2018-12-08 17:35
 **/
public class Tv {
    private String name;
    public Tv(String name){
        this.name=name;
    }
    public void  on (){
        System.out.println(name+"_电视打开");
    }
    public void off(){
        System.out.println(name+"_电视关闭");
    }
}
