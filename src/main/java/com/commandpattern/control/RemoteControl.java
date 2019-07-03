package com.commandpattern.control;

import com.commandpattern.command.Command;
import com.commandpattern.command.nullCommand.NullCommand;

/**
 * @program: testpattern
 * @description: 遥控器
 * @author: Mr.Yang
 * @create: 2018-12-08 17:39
 **/
public class RemoteControl {

    Command[] onCommand;
    Command[] offCommand;
    //这个变量来记录上一个命令
    Command upStepCommand;
    //初始化每个操作为空操作
    public RemoteControl(){
        onCommand=new Command[5];
        offCommand=new Command[5];
        NullCommand nullCommand = new NullCommand();
        for (int i = 0; i < 5; i++) {
            onCommand[i]=nullCommand;
            offCommand[i]=nullCommand;
        }
        upStepCommand=nullCommand;
    }

    public void setCommond(int index,Command onCommand,Command offCommand){
        this.offCommand[index]=offCommand;
        this.onCommand[index]=onCommand;
    }
    //新增upStepCommand记录上一步命令
    public void clickOn(int index){
        onCommand[index].exceute();
        upStepCommand=onCommand[index];
    }
    //新增upStepCommand记录上一步命令
    public void clickOff(int index){
        offCommand[index].exceute();
        upStepCommand=offCommand[index];
    }

    public void toUpStepClick(){
        System.out.println("---撤销---");
        upStepCommand.revoke();
    }
    /**
     * 输出每个按钮的具体代表类
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < onCommand.length; i++) {
            sb.append("[index : "+i+"]   ");
            sb.append(onCommand[i].getClass().getName());
            sb.append("    ");
            sb.append(offCommand[i].getClass().getName());
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
