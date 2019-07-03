package com.datastructure.stack;

import java.util.Stack;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-02 16:59
 **/
public class SolutionJson {

    public static void main(String[] args) {
        SolutionJson solution = new SolutionJson();
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
                Character peek = characters.peek();
                switch (c) {
                    case '}':
                        if (!peek.equals('{')) {
                            return false;
                        }else if(peek.equals('{')){
                            characters.pop();
                        }
                        continue;
                    case ']':
                        if (!peek.equals('[')) {
                            return false;
                        }else if(peek.equals('[')){
                            characters.pop();
                        }
                        continue;
                    case ')':
                        if (!peek.equals('(')) {
                            return false;
                        }else if(peek.equals('(')){
                            characters.pop();
                        }
                        continue;
                }
            }
        }
        return characters.isEmpty();
    }
}
