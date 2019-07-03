package com.datastructure.queue;

public interface Queue<E> {

    /**
     * 添加队列值
     * @param param
     */
    public void enqueue(E param);

    /**
     * 删除第一位()队列元素，并返回值
     * @param
     * @return
     */
    public E dequeue();

    /**
     * 得到第一位队列元素
     * @return
     */
    public E getFront();

    /**
     * 得到队列的大小
     * @return
     */
    public int getSize();

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty();
}
