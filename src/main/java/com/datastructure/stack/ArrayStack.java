package com.datastructure.stack;

import com.datastructure.array.Array;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-02 15:27
 **/
public class ArrayStack<E> implements Stack<E>{

    Array<E> array;

    public ArrayStack(int capacity){
        array=new Array<E>(capacity);
    }



    public ArrayStack(){
        array=new Array<E>();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }


    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }


    @Override
    public E peek() {
        return array.getLast();
    }

    /**
     * 获取容量值
     * @return
     */
    public int getCapacity(){
        return array.getCapacity();
    }


    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("stack: ");
        sb.append("[");
        for(int i=0;i<array.getSize();i++){
            sb.append(array.get(i));
            if(i!=array.getSize()-1){
                sb.append(", ");
            }
        }
        sb.append("]            right value is stack top");
        return sb.toString();
    }
}
