package com.Interview.packing;

/**
 * @program: test
 * @description: 测试
 * @author: Mr.Yang
 * @create: 2019-03-28 18:05
 **/
public class PackingTestTest extends PackingTest{

    /**
     *              sonClass           同包        全局
     * public          √                √           √
     * protected       √                √           ×
     * private         ×                ×           ×
     * default         √                √           ×           （看同不同包和子类没有关系）
     *
     *
     *
     * public           本类、同包、子类和全局(只要导入包就能访问)
     * protected        本类、同包和子类
     * default          本类、同包（当类、方法和变量不添加权限修饰符时，默认使用）
     * private          本类（类的内部）
     * @return
     */
    public String getSupreProperties(){
        System.out.println(super.publicName);
        System.out.println(super.protectedName);
        System.out.println(super.defaultName);
        return null;
    }
}
