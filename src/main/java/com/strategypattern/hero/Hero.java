package com.strategypattern.hero;

import com.strategypattern.behavior.ActiveSkills;

/**
 * @program: patterntest
 * @description: 英雄抽象类
 * @author: Mr.Yang
 * @create: 2018-11-06 11:53
 **/
public abstract class Hero {

    //此处行为接口类型声明了一个引用变量
    ActiveSkills activeSkills;

    //hero类的无参构造
    public Hero(){}

    /**
     * 释放技能方法，将技能委托给行为类，ActiveSkills来实现具体
     */
    public void activeSkills(String name){
        activeSkills.release(name);
    }

    public Hero activeSkills(ActiveSkills activeSkills) {
        this.activeSkills = activeSkills;
        return this;
    }
}
