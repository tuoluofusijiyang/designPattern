package com.Interview;

import java.util.HashMap;

/**
 * @program: test
 * @description: 字符串出现的次数
 * @author: Mr.Yang
 * @create: 2019-03-29 21:59
 **/
public class StringCount {

    /**
     *
     * @param count 字符串
     * @param str   统计次数的文字
     * @return
     */
    public Integer getStringCount(String count,Object str){
        String s = str.toString();
        char[] chars = count.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (!hashMap.containsKey(chars[i])){
                hashMap.put(chars[i],1);
            }else{
                hashMap.put(chars[i],hashMap.get(chars[i])+1);
            }
        }
        return hashMap.get(s.charAt(0));
    }


    public static void main(String[] args) {
        StringCount stringCount = new StringCount();
        Integer stringCount1 = stringCount.getStringCount("asdjfklas123123lsdajfklasf", 1);
        System.out.println(stringCount1);
    }
}
