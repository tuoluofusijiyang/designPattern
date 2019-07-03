package com.commandpattern.command;

/**
 * @program: testpattern
 * @description: 命令接口
 * @author: Mr.Yang
 * @create: 2018-12-08 13:54
 **/
public interface Command {

    //执行方法
    public void exceute();

    //撤销方法
    public void revoke();

}
