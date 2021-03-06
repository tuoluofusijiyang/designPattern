package com.Interview.extend;

/**
 * @program: test
 * @description: 继承测试
 * @author: Mr.Yang
 * @create: 2019-03-28 17:56
 **/
public class ExtendsTest {

    /**
     * 继承是一种联结类的层次模型，并且允许和鼓励类的重用，
     * 它提供了一种明确表述共性的方法。
     * 对象的一个新类可以从现有的类中派生，
     * 这个过程称为类继承。新类继承了原始类的特性，
     * 新类称为原始类的派生类（子类），而原始类称为新类的基类（父类）。
     * 派生类可以从它的基类那里继承方法和实例变量，
     * 并且类可以修改或增加新的方法使之更适合特殊的需要。
     * @param args
     */
    public static void main(String[] args) {
        Parent parent=new Son();
        System.out.println(parent.getName());
    }
}
