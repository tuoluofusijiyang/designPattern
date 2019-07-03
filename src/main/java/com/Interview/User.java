package com.Interview;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-26 17:42
 **/
public class User {
    Person person=new Person("父类调用person的构造函数");
    static {
        System.out.println("父类的静态方法");
    }
    public User(){
        System.out.println("父类的无参构造");
    }
    public User(String name){
        System.out.println("父类的有参构造"+name);
    }
}
