package com.iteratorpattern.list;

import com.iteratorpattern.iterator.Iterator;
import com.iteratorpattern.vo.MenuItem;

import java.util.ArrayList;

/**
 * @program: test
 * @description: list集合菜单
 * @author: Mr.Yang
 * @create: 2019-01-01 15:32
 **/
public class ListMenu {
    ArrayList<MenuItem> menuItems;
    public ListMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("紫菜鸡蛋汤","有营养的汤",6.00);
        addItem("豆腐脑","早餐必备",7.00);
        addItem("鱿鱼汤","补充大脑",8.00);
    }


    private void addItem(String name,String description,Double price){
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }
    public Iterator createIterator(){
        return new ListMenuIterator(menuItems);
    }
}
