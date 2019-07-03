package com.strategypattern.patterntest;

import com.strategypattern.behavior.YouMeng;
import com.strategypattern.hero.Annie;
import com.strategypattern.hero.Hero;
import com.strategypattern.hero.Jax;

/**
 * @program: patterntest
 * @description: 英雄换装备测试类
 * @author: Mr.Yang
 * @create: 2018-11-06 12:20
 * 算法切换：定义了一个算法接口，加减乘除实现了该接口，通过new对象或者其他形式来切换算法
 **/
public class HeroTest {
    public static void main(String[] args) {
        System.out.println("****************安妮/贾科斯   solo战****************");
        System.out.println("一号选择了内瑟斯，二号选择了安妮");
        Hero jaxHero = new Jax();
        Hero annieHero = new Annie();
        System.out.println("安妮 遭遇到 贾科斯 埋伏");
        annieHero.activeSkills(Annie.name);
        System.out.println("贾科斯 等待金身时间");
        try {
            Thread.sleep(2500);
            System.out.println("安妮 金身解除， 贾科斯 开始行动");
            jaxHero.activeSkills(Jax.name);
            System.out.println("安妮 交了闪现");
            jaxHero.activeSkills(new YouMeng());
            jaxHero.activeSkills(Jax.name);
            System.out.println("贾科斯 走A走A\r\n安妮 卒");
        } catch (InterruptedException e) {
            System.err.println("金身失败");
            System.err.println("安妮 卒");
        }
        //需求2修改,需求2需求变动很大，需要大改动,修改版本监控的标记
    }
    //需求1开始开发
}
