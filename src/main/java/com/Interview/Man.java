package com.Interview;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-26 17:42
 **/
public class Man extends User{
    Person person=new Person("子类调用person的构造函数");

    static {
        System.out.println("子类的静态方法");
    }
    public Man(){
        System.out.println("子类的无参构造");
    }
    public Man(String name){
        System.out.println("子类的有参构造"+name);
    }
}
