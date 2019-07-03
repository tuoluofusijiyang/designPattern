package com.templatemodepattern.parentclass;

/**
 * @program: test
 * @description: 果汁的制造简单流程：--》清洗水果 --》放入修饰材料--》放入榨汁机中
 *               因为放入修饰材料的流程，各个果汁不一样，所以放入子类去实现
 * @author: Mr.Yang
 * @create: 2018-12-22 13:19
 **/
public  abstract  class FruitJuiceParent {

    /**
     * 果汁的制造流程（当作固定流程，不会变），这个方法不希望子类去覆盖，子类只需要实现putMaterial()方法就行，声明为final
     */
    public final void makeFruitJuice(){
        cleanIts();
        if(isPutMaterIal()){
            putMaterial();
        }
        putMachine();
    }

    protected abstract void putMaterial();

    /**
     * 清洗水果
     */
    protected void cleanIts(){
        System.out.println("clean fruit");
    }

    /**
     * 放入榨汁机中
     */
    protected void putMachine(){
        System.out.println("put machine");
    }

    /**
     * 父类增加判断
     * @return
     */
    protected boolean isPutMaterIal(){
        return true;
    }
}
