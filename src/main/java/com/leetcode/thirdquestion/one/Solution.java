package com.leetcode.thirdquestion.one;

import java.util.ArrayList;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int abcabcabcd = solution.lengthOfLongestSubstring("abcadcb");
        System.out.println(abcabcabcd);
    }

    /**
     * right,left表示滑动窗口的前后索引
     * 1.c对应的ASCII码表的位置，例如a:97，此处的C可以等于a，也可以等于a
     * 2.对比大小，int数组字母对应ASCII位置的值
     * 3.result表示最终的结果
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        //abcadcb
        int n = s.length();
        int result = 0;
        int[] charInt = new int[256];

        for (int start = 0,end = 0; end < n; end++) {
            char c = s.charAt(end);
            start = Math.max(charInt[c], start);
            result = Math.max(result,end-start+1);
            charInt[c] = end + 1;
        }
        return result;
    }
}
