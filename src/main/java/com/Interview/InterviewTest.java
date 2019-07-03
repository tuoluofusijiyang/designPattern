package com.Interview;

/**
 * @program: test
 * @description: 测试
 * @author: Mr.Yang
 * @create: 2019-03-26 17:49
 **/
public class InterviewTest {
    /**
     * 执行顺序
     * 1.父类静态方法
     * 2.子类静态方法
     * 3.父类调用全局变量-->new person()
     * 4.person 调用自己的静态方法
     * 5.person调用父类调用的有参方法
     * 6.父类的无参构造
     * 7.person调用子类调用的有参方法
     * 8.子类的无参构造
     *
     * @param args
     */
    public static void main(String[] args) {
        Man man = new Man();
    }
    /**
     * 运行结果
     * 1.父类的静态方法
     * 2.子类的静态方法
     * 3.Person的静态方法
     * 4.person的有参构造函数父类调用person的构造函数
     * 5.父类的无参构造
     * 6.person的有参构造函数子类调用person的构造函数
     * 7.子类的无参构造
     */
}
