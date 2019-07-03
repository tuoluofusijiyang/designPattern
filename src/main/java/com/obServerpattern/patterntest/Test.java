package com.obServerpattern.patterntest;

import com.obServerpattern.show.AndroidPhone;
import com.obServerpattern.subject.ContentSubJect;

/**
 * @program: patterntest
 * @description: 观察者模式测试--subject存储所有观察者对象，
 *               当对象改变的时候，会去通知该对象下的所有观察者
 * @author: Mr.Yang
 * @create: 2018-11-06 17:48
 **/
public class Test {
    /**
     * 1.这位大咖，发布了个文章，new了一个文章源对象
     * 2.new了两个观察者，假定这里两个观察者是从数据库中查询出来的（查询到了所有关注改大咖的观察者）
     * 3.该大咖发布了第一条消息，假定消息已经存入数据库，这里传入消息的ID
     * 4.调用setContentData方法，去发送消息id为1，两个观察者收到了文章更新的消息，并展示到了手机上
     * 5.大咖又发布了一个，id为2，大咖人气没长，还是这两个关注的人，这两个人又收到了大咖的消息。
     * @param args
     */
    public static void main(String[] args) {
        ContentSubJect contentSubJect = new ContentSubJect();
        //观察者1
        new AndroidPhone(contentSubJect);
        //观察者2
        new AndroidPhone(contentSubJect);
        //A用户的发布，id为1
        contentSubJect.setContentData("1");

        ContentSubJect contentSubJect1 = new ContentSubJect();
        //观察者1
        new AndroidPhone(contentSubJect1);
        //观察者2
        new AndroidPhone(contentSubJect1);
        //A用户的发布，id为2
        contentSubJect1.setContentData("2");
    }
}
