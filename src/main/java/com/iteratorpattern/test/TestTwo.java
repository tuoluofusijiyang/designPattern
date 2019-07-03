package com.iteratorpattern.test;

import com.iteratorpattern.iterator.Iterator;
import com.iteratorpattern.arr.ArrMenu;
import com.iteratorpattern.list.ListMenu;
import com.iteratorpattern.vo.MenuItem;

/**
 * @program: test
 * @description: 测试2
 * @author: Mr.Yang
 * @create: 2019-01-01 16:17
 **/
public class TestTwo {
    public static void main(String[] args) {
        ArrMenu arrMenu = new ArrMenu();
        ListMenu listMenu = new ListMenu();
        System.out.println("---------------数组 菜类---------------");
        printMenu(arrMenu.createIterator());
        System.out.println("---------------集合 汤类---------------");
        printMenu(listMenu.createIterator());
    }
    private static void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem next = (MenuItem) iterator.next();
            System.out.println("menu name is :"+next.getName());
            System.out.println("menu description is :"+next.getDescription());
            System.out.println("menu price is :"+next.getPrice());
        }
    }
}
