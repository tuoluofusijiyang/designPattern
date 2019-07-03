package com.Interview;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-26 17:42
 **/
public class Person {

    static {
        System.out.println("Person的静态方法");
    }

    public Person(String name){
        System.out.println("person的有参构造函数"+name);
    }

    public Person(){
        System.out.println("person的无参构造函数");
    }
}
