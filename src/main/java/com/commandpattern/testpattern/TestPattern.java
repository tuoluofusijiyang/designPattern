package com.commandpattern.testpattern;

import com.commandpattern.command.off.LampOffCommand;
import com.commandpattern.command.off.TvOffCommand;
import com.commandpattern.command.on.LampOnCommand;
import com.commandpattern.command.on.TvOnCommand;
import com.commandpattern.control.RemoteControl;
import com.commandpattern.entity.Lamp;
import com.commandpattern.entity.Tv;

/**
 * @program: test
 * @description:
 * @author: Mr.Yang
 * @create: 2018-12-08 17:48
 **/
public class TestPattern {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        /**
         * 创建装置到合适位置
         */
        Tv bedRoomTV = new Tv("卧室");
        Tv drawiTV = new Tv("客厅");

        Lamp bedRoomLamp = new Lamp("卧室");
        Lamp drawiLamp = new Lamp("客厅");

        /**
         * 创建所有命令操作对象
         */
        //卧室灯关闭对象
        LampOffCommand bedLampOffCommand = new LampOffCommand(bedRoomLamp);
        //卧室灯打开对象
        LampOnCommand bedLampOnCommand = new LampOnCommand(bedRoomLamp);
        //卧室TV关闭对象
        TvOffCommand bedTvOffCommand = new TvOffCommand(bedRoomTV);
        //卧室TV打开对象
        TvOnCommand bedTVcommand = new TvOnCommand(bedRoomTV);
        //客厅灯打开对象
        LampOnCommand drawLampOnCommand = new LampOnCommand(drawiLamp);
        //客厅灯关闭对象
        LampOffCommand drawLampOffCommand = new LampOffCommand(drawiLamp);
        //客厅TV关闭对象
        TvOffCommand drawTVOffCommand = new TvOffCommand(drawiTV);
        //客厅TV打开对象
        TvOnCommand drawTVOnCommand = new TvOnCommand(drawiTV);

        System.out.println("---------------------------------------------未赋值之前------------------------------------------------");
        System.out.println(remoteControl);
        System.out.println("******************************************************************************************************");

        /**
         * //将操作对象与卡槽一一对应
         */
        //赋值卧室灯打开与关闭
        remoteControl.setCommond(0,bedLampOnCommand,bedLampOffCommand);
        //赋值卧室TV打开与关闭
        remoteControl.setCommond(1,bedTVcommand,bedTvOffCommand);
        //赋值客厅灯打开与关闭
        remoteControl.setCommond(2,drawLampOnCommand,drawLampOffCommand);
        //赋值客厅TV打开与关闭
        remoteControl.setCommond(3,drawTVOnCommand,drawTVOffCommand);

        System.out.println("---------------------------------------------赋值之后------------------------------------------------");
        System.out.println(remoteControl);
        System.out.println("******************************************************************************************************");


        /**
         * 测试每一个按钮
         */
        remoteControl.clickOn(0);
        remoteControl.clickOff(0);

        //撤销一次
        remoteControl.toUpStepClick();
        System.out.println("\r\n");

        //撤销一次
        remoteControl.toUpStepClick();
        System.out.println("\r\n");

        remoteControl.clickOn(1);
        remoteControl.clickOff(1);

        //撤销一次
        remoteControl.toUpStepClick();
        System.out.println("\r\n");

        remoteControl.clickOn(2);
        remoteControl.clickOff(2);

        //撤销一次
        remoteControl.toUpStepClick();
        System.out.println("\r\n");

        remoteControl.clickOn(3);
        remoteControl.clickOff(3);

        //撤销一次
        remoteControl.toUpStepClick();
        System.out.println("\r\n");

    }
}
