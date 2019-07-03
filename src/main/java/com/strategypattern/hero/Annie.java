package com.strategypattern.hero;

import com.strategypattern.behavior.ZhongYa;

/**
 * @program: patterntest
 * @description: 英雄安妮
 * @author: Mr.Yang
 * @create: 2018-11-06 12:14
 **/
public class Annie extends Hero{
    public static String name="安妮";

    public Annie(){
        activeSkills=new ZhongYa();
    }
    //为什么提示
}
