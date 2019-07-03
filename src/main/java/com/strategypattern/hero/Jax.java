package com.strategypattern.hero;

import com.strategypattern.behavior.LanDun;

/**
 * @program: patterntest
 * @description: 英雄贾科斯
 * @author: Mr.Yang
 * @create: 2018-11-06 12:08
 **/
public class Jax extends Hero{
    public static String name="贾克斯";
    public Jax(){
        activeSkills = new LanDun();
    }

}
