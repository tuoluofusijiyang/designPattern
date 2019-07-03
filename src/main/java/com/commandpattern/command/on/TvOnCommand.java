package com.commandpattern.command.on;

import com.commandpattern.command.Command;
import com.commandpattern.entity.Tv;

/**
 * @program: testpattern
 * @description: 电视打开
 * @author: Mr.Yang
 * @create: 2018-12-08 17:37
 **/
public class TvOnCommand implements Command {
    Tv tv;
    public TvOnCommand(Tv tv){
        this.tv=tv;
    }

    public void exceute() {
        tv.on();
    }
    //执行到这个具体实现类，代表上一步是电视打开，撤销操作即为电视关闭
    public void revoke() {
        tv.off();
    }
}
