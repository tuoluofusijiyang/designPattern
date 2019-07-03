package com.datastructure.stack;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-02 16:11
 **/
public class StackTest {

    public static void main(String[] args) {
        ArrayStack<Integer> integerArrayStack = new ArrayStack<>();
        for(int i=0;i<5;i++){
            integerArrayStack.push(i);
            System.out.println(integerArrayStack);
        }
        Integer pop = integerArrayStack.pop();
        System.out.println("----移除上级元素----value is "+pop);
        System.out.println("-------------移除之后的栈打印------------------");
        System.out.println(integerArrayStack);
    }
}
