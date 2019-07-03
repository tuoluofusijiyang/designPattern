package com.obServerpattern.show;

import com.obServerpattern.observer.Observer;
import com.obServerpattern.subject.SubJect;

/**
 * @program:
 * @description: AndroidPhone
 * @author: Mr.Yang
 * @create: 2018-11-06 17:35
 **/
public class AndroidPhone implements Observer,ShowPhone {
    private String id;
    private SubJect contentSubject; //此对象暂时作为全局变量


    public AndroidPhone(SubJect contentSubject){
        this.contentSubject=contentSubject;
        contentSubject.registObserver(this);
    }

    //update被调用，处理，展示到手机端
    public void update(String id) {
        this.id=id;
        showPhoneOfContent();
    }

    public void showPhoneOfContent() {
        System.out.println("获取到了文章ID，通知后台接口，去处理拿到数据，安卓端展示到手机上:id"+id);
    }
}
