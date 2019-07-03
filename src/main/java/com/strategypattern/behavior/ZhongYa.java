package com.strategypattern.behavior;

/**
 * @program: patterntest
 * @description: 中娅沙漏释放动作
 * @author: Mr.Yang
 * @create: 2018-11-06 11:46
 **/
public class ZhongYa implements ActiveSkills{
    public void release(String name) {
        System.out.println(name+" 释放了中娅沙漏,金身");
    }
}
