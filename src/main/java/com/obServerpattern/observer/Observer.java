package com.obServerpattern.observer;

public interface Observer {
    /**
     * 有新的文章的时候，将值传递给观察者，观察者去处理
     * @param id    发布文章的ID
     */
    public void update(String id);

}
