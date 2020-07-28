package com.leetcode.fifthquestion.one;

import java.util.Stack;

public class Solution {

    public String longestPalindrome(String s) {
        String result = null;
        char[] chars = s.toCharArray();
        Stack<Character> stackString = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            stackString.push(chars[i]);
            for (int j = i; j < chars.length; j++) {

            }
        }
        return "";
    }
}
