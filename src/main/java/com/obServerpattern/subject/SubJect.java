package com.obServerpattern.subject;

import com.obServerpattern.observer.Observer;

public interface SubJect {
    //将观察者注册到变量中
    public void registObserver(Observer observer);
    //将观察者从变量中删除
    public void removeObserver(Observer observer);
    //发布新的文章，去通知观察者
    public void notifyAllObServer();
}
