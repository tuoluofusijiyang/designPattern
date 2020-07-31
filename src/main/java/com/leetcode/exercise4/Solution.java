package com.leetcode.exercise4;

/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints = {1,1,1,1,1,1,0,1,1,1,1};
        Solution solution = new Solution();
        int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(ints);
        System.out.println(maxConsecutiveOnes);
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        for (int slow = 0,fast = 0; fast < nums.length; fast++) {
            if(nums[fast]!=1){
                slow = fast+1;
            }else{
                result = Math.max(result,fast-slow+1);
            }
        }
        return result;
    }
}
