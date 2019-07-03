package com.strategypattern.behavior;

/**
 * @program: patterntest
 * @description: 幽梦之灵释放动作
 * @author: Mr.Yang
 * @create: 2018-11-06 11:50
 **/
public class YouMeng implements ActiveSkills{
    public void release(String name) {
        System.out.println(name+" 释放了幽梦之灵，对自个加速");
    }
}
