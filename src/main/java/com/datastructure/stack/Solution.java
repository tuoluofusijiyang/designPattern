package com.datastructure.stack;

import java.util.Stack;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-02 16:59
 **/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{\"name\": \"网站\",\"num\": 3,\"sites\": [ \"Google.com\", \"Taobao.com\", \"Waibo.wang\" ]}"));
    }
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                characters.push(c);
            } else {
                if(characters.isEmpty()){
                    return false;
                }
                Character peek = characters.pop();
                switch (c) {
                    case '}':
                        if (!peek.equals('{')) {
                            return false;
                        }
                        continue;
                    case ']':
                        if (!peek.equals('[')) {
                            return false;
                        }
                        continue;
                    case ')':
                        if (!peek.equals('(')) {
                            return false;
                        }
                        continue;
                }
            }
        }
        return characters.isEmpty();
    }

    /*public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                characters.push(c);
            } else {
                if(characters.isEmpty()){
                    return false;
                }
                Character toChar = characters.pop();
                if(c == ')' && toChar != '('){
                    return false;
                }
                if(c == '}' && toChar != '{'){
                    return false;
                }
                if(c == ']' && toChar != '['){
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }*/
}
