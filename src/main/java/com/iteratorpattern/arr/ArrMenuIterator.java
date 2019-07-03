package com.iteratorpattern.arr;

import com.iteratorpattern.iterator.Iterator;
import com.iteratorpattern.vo.MenuItem;

/**
 * @program: test
 * @description: 数组遍历方式迭代器
 * @author: Mr.Yang
 * @create: 2019-01-01 15:46
 **/
public class ArrMenuIterator implements Iterator {
    MenuItem[] items;
    int position=0;
    public ArrMenuIterator(MenuItem[] items){
        this.items=items;
    }

    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem item = items[position];
        position+=1;
        return item;
    }
}
