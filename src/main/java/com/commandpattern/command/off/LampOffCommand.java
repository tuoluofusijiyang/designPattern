package com.commandpattern.command.off;

import com.commandpattern.command.Command;
import com.commandpattern.entity.Lamp;

/**
 * @program: testpattern
 * @description: 灯关闭
 * @author: Mr.Yang
 * @create: 2018-12-08 17:33
 **/
public class LampOffCommand implements Command {

    Lamp lamp;

    public LampOffCommand(Lamp lamp){
        this.lamp=lamp;
    }
    //灯关闭
    public void exceute() {
        lamp.off();
    }
    //执行到这个具体实现类，代表上一步是灯关闭，撤销操作即为灯打开
    public void revoke() {
        lamp.on();
    }
}
