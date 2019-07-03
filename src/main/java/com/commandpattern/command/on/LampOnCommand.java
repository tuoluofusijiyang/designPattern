package com.commandpattern.command.on;

import com.commandpattern.command.Command;
import com.commandpattern.entity.Lamp;

/**
 * @program: testpattern
 * @description: 灯打开的命令
 * @author: Mr.Yang
 * @create: 2018-12-08 17:29
 **/
public class LampOnCommand implements Command {

    Lamp lamp;
    public LampOnCommand(Lamp lamp){
        this.lamp=lamp;
    }

    //灯打开的命令
    public void exceute() {
        lamp.on();
    }
    //执行到这个具体实现类，代表上一步是灯打开，撤销操作即为灯关闭
    public void revoke() {
        lamp.off();
    }
}
