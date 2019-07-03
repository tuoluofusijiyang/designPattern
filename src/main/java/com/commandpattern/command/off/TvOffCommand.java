package com.commandpattern.command.off;

import com.commandpattern.command.Command;
import com.commandpattern.entity.Tv;

/**
 * @program: testpattern
 * @description: 电视关闭
 * @author: Mr.Yang
 * @create: 2018-12-08 17:36
 **/
public class TvOffCommand implements Command {
    Tv tv;
    public TvOffCommand(Tv tv){
        this.tv=tv;
    }
    public void exceute() {
        tv.off();
    }
    //执行到这个具体实现类，代表上一步是电视关闭，撤销操作即为电视打开
    public void revoke() {
        tv.on();
    }
}
