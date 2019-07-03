package com.appearancepattern;

/**
 * @program: test
 * @description: 外观封装类
 * @author: Mr.Yang
 * @create: 2018-12-16 15:01
 **/
public class AppearanceEnc {
    AppStore appStore;
    Wechat wechat;
    public AppearanceEnc(AppStore appStore,Wechat wechat){
        this.appStore=appStore;
        this.wechat=wechat;
    }

    /**
     * 组装发送消息的操作
     */
    public void encSendMessage(){
        appStore.findApp("wechat");
        appStore.downLoadApp();
        wechat.inputNamePass("测试","123");
        wechat.clickLogin();
        wechat.findUser("小明");
        wechat.sendMessage("在吗？借点钱");
    }
}
