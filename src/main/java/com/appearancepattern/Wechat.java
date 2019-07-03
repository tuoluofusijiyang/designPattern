package com.appearancepattern;

/**
 * @program: test
 * @description: 微信方法封装类
 * @author: Mr.Yang
 * @create: 2018-12-16 14:54
 **/
public class Wechat {
    /**
     * 输入微信账号密码
     * @param userName 微信账号
     * @param passWord 微信密码
     */
    public void inputNamePass(String userName,String passWord){
        System.out.println("输入账号密码：userName:"+userName+" 密码："+passWord);
    }

    /**
     * 点击登陆
     */
    public void clickLogin(){
        System.out.println("点击登陆");
    }

    /**
     * 查找用户
     */
    public  void findUser(String userName){
        System.out.println("查找用户 userName : "+userName);
    }

    /**
     * 发送消息
     * @param message 消息内容
     */
    public void sendMessage(String message){
        System.out.println("发送消息：message : "+message);
    }

}
