package com.commandpattern.command.nullCommand;

import com.commandpattern.command.Command;

/**
 * @program: testpattern
 * @description: 建立一个空对象，在许多设计模式种，都会看到空对象的使用，甚至有些时候，空对象本身也被视为一种设计模式
 * @author: Mr.Yang
 * @create: 2018-12-08 17:40
 **/
public class NullCommand implements Command {
    public void exceute() {
        System.out.println("什么都不做处理");
    }

    public void revoke() {
        System.out.println("什么都不做处理");
    }
}
