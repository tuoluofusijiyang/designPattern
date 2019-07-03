package com.abstractfactorypattern.material.vo;

/**
 * @program: designPattern
 * @description: 代表了中国的材料源,将它与其他材料源实现一个共同的父类，方便接收
 * @author: Mr.Yang
 * @create: 2018-11-20 21:24
 **/
public class ChineseAddress extends Address{

    public ChineseAddress(){
        name="中国材料源";
    }
}
