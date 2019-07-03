package com.datastructure.array;

import java.util.Arrays;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-01 16:46
 **/
public class ArrayTest {

    public static void main(String[] args) {
        Array<Integer> integerArray = new Array<Integer>(10);
        for (int i = 0; i < 10; i++) {
            integerArray.addLast(i);
        }
        System.out.println(integerArray);

        System.out.printf("--------------------将容量设置为10，添加10个元素，元素的容量 : %d -------------------\r\n",integerArray.getCapacity());

        integerArray.addLast(21);
        System.out.printf("--------------------元素+1，元素的容量 : %d --------------------\r\n",integerArray.getCapacity());


        integerArray.removeLast();
        System.out.printf("--------------------元素-1，元素的容量 : %d --------------------\r\n",integerArray.getCapacity());

        integerArray.removeLast();
        System.out.printf("--------------------元素-1，元素的容量 : %d --------------------\r\n",integerArray.getCapacity());

        for(int x=0;x<=5;x++){
            integerArray.removeLast();
        }
        System.out.printf("--------------------元素-1/4，元素的容量 : %d --------------------\r\n",integerArray.getCapacity());


    }
}
