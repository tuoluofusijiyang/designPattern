package com.leetcode.firstquestion.one;

import java.util.Arrays;

/**
 * @program: test
 * @description: 两数之和 给定一个整数数组 nums 和一个目标值 target，
 *                       请你在该数组中找出和为目标值的那
 *                       两个 整数，并返回他们的数组下标。
 * @author: Mr.Yang
 * @create: 2019-05-08 09:20
 **/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        int indexOne=0;
        int indexTwo=0;
        boolean flag=false;
        for(int x=0;x<nums.length;x++){
            for(int y=x+1;y<nums.length;y++){
                if((nums[x]+nums[y])==target){
                    indexOne=x;
                    indexTwo=y;
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        ints[0]=indexOne;
        ints[1]=indexTwo;
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution solution = new Solution();
        int[] ints1 = solution.twoSum(ints, 9);
        System.out.println(Arrays.toString(ints1));
    }
}
