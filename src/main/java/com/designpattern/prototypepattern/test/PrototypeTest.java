package com.designpattern.prototypepattern.test;

import com.designpattern.prototypepattern.vo.User;

/**
 * @version v1.0
 * @Copyright(c): 2020-2020
 * @FileName: PrototypeTest.java
 * @Description:
 * @autho Admin
 * @date 2020/1/14 15:27
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        System.out.println(user.toString());
        User clone = (User) user.clone();
        System.out.println(clone.toString());
    }
}
