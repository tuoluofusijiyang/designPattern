package com.leetcode.bubbling;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Copyright(c): 2015-2019
 * @FileName: SortDemo.java
 * @Description:
 * @History:
 * @name 版本号       作者         日期                  简要介绍     相关操作
 * @value v1.0       杨小杰       2019/8/16 18:00
 */
public class SortDemo {
    public static void main(String[] args) {
        int [] a = {1,2,3,5,3,1,6,4};
        System.out.println("--------排序【冒泡排序】开始--------");
        System.out.println(Arrays.toString(bubblingSort(a)));
        System.out.println("--------排序【冒泡排序】结束--------");

        System.out.println("--------分割线--------");

        System.out.println("--------排序【选择排序】开始--------");
        System.out.println(Arrays.toString(selectSort(a)));
        System.out.println("--------排序【选择排序】结束--------");

        System.out.println("--------分割线--------");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();


        System.out.println((-22) % 2);

    }

    /**
     * 冒泡排序
     *
     * 1.比较相邻的两个数据，如果第二个数小，就交换位置。
     * 2.从后向前两两比较，一直到比较最前两个数据。最终最小数被交换到起始的位置，
     * 这样第一个最小数的位置就排好了。
     * 3.继续重复上述过程，依次将第2.3...n-1个最小数排好位置。
     * @param a 需要排序的数组
     * @return
     */
    public static int[] bubblingSort(int[] a){
        int temp = 0;
        boolean flag ;
        for(int x= 0;x<a.length - 1;x++){
            flag = false;
            for(int y = a.length -1 ; y>x;y--){
                if(a[y] < a[y - 1]){
                    temp = a[y];
                    a[y] = a [y - 1];
                    a[y - 1] = temp;
                    flag = true;
                }
                System.out.println(Arrays.toString(a));
            }
            if( flag ) break ;
        }
        return a;
    }

    /**
     * 选择排序
     *
     * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
     * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
     * 。。。
     * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
     * @param a
     * @return
     */
    public static int[] selectSort(int[] a){
        for(int x = 0 ; x <a.length-1;x++){
            int minIndex = x;
            for (int y = x+1; y < a.length; y++) {
                if(a[y]<a[minIndex]){
                    minIndex = y;
                }
            }
            if(minIndex!=x){
                int temp = a[x];
                a[x] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;
    }
}
