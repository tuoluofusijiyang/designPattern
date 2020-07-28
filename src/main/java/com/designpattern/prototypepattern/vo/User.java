package com.designpattern.prototypepattern.vo;

import lombok.Data;

/**
 * @version v1.0
 * @Copyright(c): 2020-2020
 * @FileName: User.java
 * @Description:
 * @autho Admin
 * @date 2020/1/14 14:00
 */

public class User implements Cloneable{
    /**
     * 用户名
     */
    private String UserName;

    /**
     * 密码
     */
    private String passWord;

    public User(){
        System.out.println("无参构造打印");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
