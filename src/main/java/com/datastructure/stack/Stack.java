package com.datastructure.stack;

public interface Stack<E> {

    /**
     * 向栈插入元素
     * @param e
     */
    public  void push(E e);


    /**
     * 取出最上面的元素，并且返回
     * @return
     */
    public E pop();

    /**
     * 获取栈的大小
     * @return
     */
    public int getSize();

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 获取栈最上面的元素
     * @return
     */
    public E peek();
}
