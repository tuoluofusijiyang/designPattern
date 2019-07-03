package com.abstractfactorypattern.kind.factory;

import com.abstractfactorypattern.material.vo.Address;

/**
 * @program: designPattern
 * @description: 面包口味的抽象类
 * @author: Mr.Yang
 * @create: 2018-11-18 19:24
 **/
public abstract class BreadFactory {
    protected String name;
    protected String type;
    public Address address;

    protected abstract void toSelectAddress();

    public BreadFactory stir(){
        System.out.println("搅拌");
        return this;
    }

    public BreadFactory rubbingRound(){
        System.out.println("搓圆");
        return this;
    }

    public BreadFactory machining(){
        System.out.println("加工");
        return this;
    }
    public BreadFactory bake(){
        System.out.println("烘烤");
        return this;
    }

    public String getName() {
        return name;
    }

    public BreadFactory setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public BreadFactory setType(String type) {
        this.type = type;
        return this;
    }
}
