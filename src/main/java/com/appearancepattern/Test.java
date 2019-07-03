package com.appearancepattern;

/**
 * @program: test
 * @description: 客户端测试类
 * @author: Mr.Yang
 * @create: 2018-12-16 15:04
 **/
public class Test {
    /**
     * 使用了外观模式，不仅提供了一个简化的接口访问，还可以进行单独的接口访问。
     * 外观模式的特征：提供简化接口的同时，依然将系统完整的功能暴露出来，以共需要的程序使用
     * @param args
     */
    public static void main(String[] args) {
        AppStore appStore = new AppStore();
        Wechat wechat = new Wechat();
        AppearanceEnc appearanceEnc = new AppearanceEnc(appStore,wechat);
        appearanceEnc.encSendMessage();
    }
/*
    *//**
     * 客户端测试，如果没有做一个统一方法的组合处理，客户端代码会变得很多。
     * @param args
     *//*
    public static void main(String[] args) {
        AppStore appStore = new AppStore();
        Wechat wechat = new Wechat();
        appStore.findApp("wechat");
        appStore.downLoadApp();
        wechat.inputNamePass("测试","123");
        wechat.clickLogin();
        wechat.findUser("小明");
        wechat.sendMessage("在吗？借点钱");
    }*/
}
