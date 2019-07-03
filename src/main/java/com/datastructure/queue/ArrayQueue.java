package com.datastructure.queue;

import com.datastructure.array.Array;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-03 18:19
 **/
public class ArrayQueue<E> implements Queue<E>{

    Array<E> array;


    public ArrayQueue(int capacity){
        array=new Array<E>(capacity);
    }



    public ArrayQueue(){
        array=new Array<E>();
    }


    @Override
    public void enqueue(E param) {
        array.addLast(param);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
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
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("front: ");
        sb.append("[");
        for(int i=0;i<array.getSize();i++){
            sb.append(array.get(i));
            if(i!=array.getSize()-1){
                sb.append(", ");
            }
        }
        sb.append("]  tail");
        return sb.toString();
    }
}
