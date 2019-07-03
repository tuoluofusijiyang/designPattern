package com.strategypattern.behavior;

/**
 * @program: patterntest
 * @description: 兰顿之兆释放动作
 * @author: Mr.Yang
 * @create: 2018-11-06 11:49
 **/
public class LanDun implements ActiveSkills{
    public void release(String name) {
        System.out.println(name+" 释放了兰顿之兆，对周围对人减速");
    }
}
