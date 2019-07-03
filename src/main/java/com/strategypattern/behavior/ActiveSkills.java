package com.strategypattern.behavior;

/**
 * @program: patterntest
 * @description: 主动技能,行为类的接口，实现该接口的都是行为，即动作
 * @author: Mr.Yang
 * @create: 2018-11-06 11:44
 **/
public interface ActiveSkills {
    void release(String name);
}
