package com.leetcode.firstquestion.two;

import java.util.Arrays;
import java.util.HashMap;

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
        HashMap<Object, Integer> argsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            if(argsMap.containsKey(target - value)){
                return new int[]{i, argsMap.get(target - value)};
            }
            argsMap.put(value,i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution solution = new Solution();
        int[] ints1 = solution.twoSum(ints, 9);
        System.out.println(Arrays.toString(ints1));
    }
}
