package com.datastructure.queue;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2019-05-03 18:26
 **/
public class QueueTest {



    public static void main(String[] args) {
        LoopQueue<Integer> integerArrayQueue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            integerArrayQueue.enqueue(i);
            System.out.println(integerArrayQueue);


            if(i % 3 == 2){
                integerArrayQueue.dequeue();
                System.out.println(integerArrayQueue);
            }
        }
    }
}
