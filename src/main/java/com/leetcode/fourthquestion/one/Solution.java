package com.leetcode.fourthquestion.one;

import java.util.Arrays;
import java.util.logging.Level;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 *
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 *
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 *
 * 示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,3};
        int[] nums2 = new int[]{1};
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    /**
     * 没有达标，正确做法是使用二分法
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] bigInt = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length+nums2.length; i++) {
            if(i<nums1.length){
                bigInt[i] = nums1[i];
            }else{
                bigInt[i] = nums2[i-nums1.length];
            }
        }
        for (int i = 0; i < bigInt.length-1; i++) {
            for(int y = 0;y<bigInt.length-i-1;y++){
                if(bigInt[y]>bigInt[y+1]){
                    int temp = bigInt[y];
                    bigInt[y] = bigInt[y+1];
                    bigInt[y+1] = temp;
                }
            }
        }
        if(bigInt.length%2==0){
            int a = bigInt.length/2;
            double i = (double) (bigInt[a-1] + bigInt[a]) / 2;
            return i;
        }else{
            int a = bigInt.length/2;
            return bigInt[a];
        }
    }
}
