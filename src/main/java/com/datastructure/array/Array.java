package com.datastructure.array;

import java.util.Arrays;
import java.util.List;

/**
 * @program: test
 * @description: 自定义数组封装工具类
 * @author: Mr.Yang
 * @create: 2019-05-01 15:36
 **/
public class Array<E> {

    private Integer size;

    private E[] data;


    /**
     * 有参构造函数
     *
     * @param capacity 封装data的容量值
     */
    public Array(Integer capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，设置默认容量为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中的元素个数
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     *
     * @return
     */
    public Integer getCapacity() {
        return data.length;
    }

    /**
     * 判断数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 从数组中删除index位置的元素，并且返回对应的值
     * 1.假如删除索引为3的元素
     * 2.需要将索引大于3的元素向前移动一位
     * 3.因为数组中少了一个值，所以元素-1
     * 4.用临时变量来存储删除的值，用来返回
     * @param index
     * @return
     */
    public E remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("删除失败，索引的值不能小于0，并且索引的值不能大于等于数组的大小");
        }
        E temp=data[index];
        for(int i = index+1 ; i < size ; i++){
            data[i-1]=data[i];
        }
        size--;
        if(size == data.length / 4 ){
            resize(data.length / 2 );
        }
        return temp;
    }

    /**
     * 删除第一位元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一位元素
     */
    public E removeLast(){
        return remove(size-1);
    }

    /**
     * 查看某个值是否在数组中存在，如果存在,删除并返回true，如果不存在 返回false
     * @param param
     */
    public boolean removeElement(E param){
        Integer index = find(param);
        if(index != -1){
            remove(index);
            return true;
        }
        return false;
    }

    /**
     * 遍历数组，移除元素
     * @param param
     */
    public void removeAllElement(E param){
        for(E d:data){
            removeElement(param);
        }
    }
    /**
     * 在索引为index的位置，插入param
     * 1.假如在索引为2的位置插入元素
     * 2.需要将原来索引为2及其以后的位置向后移动一整位
     * 3.移动完成之后，在索引为2的位置插入指定的值
     * 4.因为数组中多了一个值，所以size需要+1
     *
     * @param index 元素的索引
     * @param param 值
     */
    public void add(int index, E param) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("添加失败，索引的值不能小于0，并且索引的值不能大于数组的大小");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = param;
        size++;
    }

    /**
     * 扩容方法
     * 1.需要new一个object，new E[i]  java不支持这样写
     * 2.object是所有类的基类，用object然后强转一下就可以
     * 3.扩展之后，需要将原数组中的值，放入扩展之后的数组中
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data=newData;
    }

    /**
     * 在所有元素之前添加值
     *
     * @param param
     */
    public void addFirst(E param) {
        add(0, param);
    }

    /**
     * 在所有元素之后添加值
     *
     * @param param
     */
    public void addLast(E param) {
        add(size, param);
    }


    /**
     * 获取索引位置的元素
     * @param index
     * @return
     */
    public E get(Integer index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("获取失败，索引的值不能小于0，并且索引的值不能大于等于数组的大小");
        }
        return data[index];
    }

    /**
     * 获取第一个索引的元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取最后一个索引的元素
     * @return
     */
    public E getLast(){
        return get(size-1);
    }

    /**
     * 查看数组中是否包含某个元素
     * @param param
     * @return
     */
    public boolean contains(E param){
        for(int i = 0 ; i < size ; i++){
            if(data[i] == param){
                return true;
            }
        }
        return false;
    }


    /**
     * 查找数组中是否包含param，如果包含返回索引值，不包含返回-1
     * @param param
     * @return
     */
    public Integer find(E param){
        for(int i = 0 ; i < size ; i++){
            if(data[i] == param){
                return i;
            }
        }
        return -1;
    }

    /**
     * 查找数组中是否包含param
     * 1.创建一个int数组用来接收返回的索引值
     * 2.索引容量最大为数组的大小
     * 3.用临时变量来存储int数组的大小
     * 4.如果相等，给 int数组 为临时变量的元素赋值(相等的索引)，临时变量自增
     * @param param
     * @return
     */
    public Integer[] findAll(E param){
        int intTemp=0;
        Integer[] integers = new Integer[size];
        for(int i = 0 ; i < size ; i++){
            if(data[i] == param){
                integers[intTemp]=i;
                intTemp++;
            }
        }
        return integers;
    }
    /**
     * 修改数组中元素的值
     * @param index
     * @param param
     */
    public void set(int index,E param){
        if(index<0 || index>= size){
            throw new IllegalArgumentException("获取失败，索引值无效");
        }
        data[index]=param;
    }




    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public List toList(){
        return Arrays.asList(data);
    }
}
