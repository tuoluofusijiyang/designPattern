package com.datastructure.linked;

import java.util.HashMap;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-09 09:27
 **/
public class LinkedList<E> {

    /**
     * 定义一个内部类
     * 类：只允许linkedList主类和Node类自身调用
     * 成员属性：设置为public跟private class结合，允许linkedList主类直接访问属性
     */
    private class Node{
        public E e;
        public Node next;


        public Node(E e ,Node next){
            this.e = e ;
            this.next = next ;
        }

        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }
    }

    //head指向当前的第一位元素
    private Node head;

    //链表的大小
    private int size;

    public LinkedList(){
        head = null;
        size=0;
    }


    public LinkedList(Node head){
        this.head=head;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 在头插入元素
     * 1.需要将内部类中的next设置为之前的元素，因为head指向的是第一位元素，即next=head
     * 2.head要重新指向第一个元素，即新建立的node
     *
     * @param e
     */
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head = node;

        head = new Node(e,head);
        size ++;
    }
}
