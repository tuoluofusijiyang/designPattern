package com.templatemodepattern.subclass;

import com.templatemodepattern.parentclass.FruitJuiceParent;

/**
 * @program: test
 * @description: 草莓汁，无添加
 * @author: Mr.Yang
 * @create: 2018-12-22 13:46
 **/
public class StrawberryFruitJuice extends FruitJuiceParent {

    protected void putMaterial() {

    }

    @Override
    protected boolean isPutMaterIal() {
        return false;
    }
}
