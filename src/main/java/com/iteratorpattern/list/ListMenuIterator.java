package com.iteratorpattern.list;

import com.iteratorpattern.iterator.Iterator;
import com.iteratorpattern.vo.MenuItem;

import java.util.ArrayList;

/**
 * @program: test
 * @description: list迭代器
 * @author: Mr.Yang
 * @create: 2019-01-01 16:12
 **/
public class ListMenuIterator implements Iterator {
    ArrayList listMenus;
    int position=0;
    public ListMenuIterator(ArrayList listMenus){
        this.listMenus=listMenus;
    }

    public boolean hasNext() {
        if(position>=listMenus.size() || listMenus.get(position)==null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) listMenus.get(position);
        position+=1;
        return menuItem;
    }
}
