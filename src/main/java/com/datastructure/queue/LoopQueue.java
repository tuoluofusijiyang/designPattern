package com.datastructure.queue;

import java.awt.*;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-03 16:44
 **/
public class LoopQueue<E> implements Queue<E> {

    private E[] data;

    //指向队列的第一个元素，初始指向0
    private int front;

    //指向队列的最后一个元素的后一个位置，初始指向0
    private int tail;

    private int size;

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }

    public LoopQueue(){
        this(10);
    }

    /**
     * 因为容量放的时候多了个1，所以get容量的时候，需要减1
     * @return
     */
    public int getCapacity(){
        return data.length-1;
    }


    /**
     * 1.if((tail + 1) % data.length == front) 如果tail + 1 超过了data.length的大小，
     *   代表当前tail指向已经超出了容量的大小，因为是循环式，所以需要tail去循环头元素中查看值是否有被占用，
     *   如果 == front 代表循环头没有，就需要扩容了。
     * 2.举例： 元素容量为8，tail目前指向7 front 指向2
     *          if((7 + 1) % 8 == 2 )  if(0 == 2) 这里是false，因为front指向了2，所以代表 第0,1位是没有值的
     *          所以这个值需要在在第0位放(空间利用)
     * 3.data[tail] = param  tail当前指向的地方需要赋值，然后tail自增 循环体 的1，size+1
     * @param param
     */
    @Override
    public void enqueue(E param) {
        if((tail + 1) % data.length == front){
            resize(getCapacity() * 2);
        }
        data[tail] = param ;
        tail = (tail + 1) % data.length;
        size ++ ;
    }

    /**
     * 扩充队列的容量
     * 1.front代表了当前元素初始位置的指向
     * 2.newData的第i位元素，应该等于 i + front % data.length 的值
     * 3.举例：元素容量20，i 等于 0 ，front 等于 2，结果： newData[0] = data[(0 + 2) %  20]
     *         = data[2]   意思就是，newData的第一位元素，应该等于data有值的第一位元素
     *         % data.length 的原因主要是为了防止数组越界错误
     * 4.新数组赋值完成需要将 front 重新指向0，因为新数组的front指针是从0开始的。
     *   tail最后要指向等于size大小的值，
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for(int i = 0 ; i < size ; i++){
            newData[i] = data[(i + front ) % data.length];
        }
        data=newData;
        front = 0 ;
        tail = size;
    }

    /**
     * 1.如果队列为空抛出异常
     * 2.用ret变量来接受当前队列头的值
     * 3.接收成功之后将，队列头元素置空
     * 4.front指针指向下一个元素
     * 5.size大小-1
     * 6.如果size大小占据了容量的1/4和size为容量的1/2且不等于0的时候，对容量进行缩减，缩减为原来容量的1/2
     * 7.返回ret变量
     * @return
     */
    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalArgumentException("dequeue is fail ,because queue is empty");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size -- ;
        if(size == getCapacity() / 4 && getCapacity() / 2 != 0 ){
            resize(getCapacity() / 2 );
        }
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty()){
            throw new IllegalArgumentException("queue is empty");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    /**
     * 当front和tail的值相等时，队列为空，初始两个指向的是同一个值（只有初始的时候，指向的是同一个地方）
     * @return
     */
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 1.元素从 front位置开始循环遍历，i的值不能等于tail，
     *   也就是到tail的前一位，i = i + 1 且%data.length，
     *   因为i有可能从循环头重新开始
     * 2.( i + 1 ) % data.length != tail  如果当前i + 1 % data.length
     *   不等于tail表示不到最后一个元素，就拼接，
     * @return
     */
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("Array: size = %d , capacity = %d\n", size, getCapacity()));
        sb.append("front [");
        for (int i = front; i != tail ; i = (i + 1) % data.length) {
            sb.append(data[i]);
            if (( i + 1 ) % data.length != tail) {
                sb.append(", ");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }
}
