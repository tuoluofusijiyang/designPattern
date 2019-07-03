package com.obServerpattern.subject;

import com.obServerpattern.observer.Observer;

import java.util.ArrayList;

/**
 * @program: patterntest
 * @description: 文章发布源
 * @author: Mr.Yang
 * @create: 2018-11-06 17:26
 **/
public class ContentSubJect implements SubJect{
    private ArrayList<Observer> observers;
    private String id;

    public ContentSubJect(){
        observers=new ArrayList<Observer>();
    }

    public void registObserver(Observer observer) {
        //调用注册方法，将观察者添加至对象中
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        //调用删除方法，将观察者从对象中删除
        observers.remove(observer);
    }

    public void notifyAllObServer() {
        //所有的观察者，子类，都实现了，update方法，所以调用update，可以通知到
        for (Observer observer : observers) {
            observer.update(id);
        }
    }
    //获取到了更新文章的消息，去通知所有观察者
    private void getContentData(){
        notifyAllObServer();
    }

    //放入新文章的消息
    public void  setContentData(String id){
        this.id=id;
        notifyAllObServer();
    }
}
