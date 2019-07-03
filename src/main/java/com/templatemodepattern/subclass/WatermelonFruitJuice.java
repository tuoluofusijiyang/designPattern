package com.templatemodepattern.subclass;

import com.templatemodepattern.parentclass.FruitJuiceParent;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: test
 * @description: 西瓜汁
 * @author: Mr.Yang
 * @create: 2018-12-22 13:29
 **/
public class WatermelonFruitJuice extends FruitJuiceParent {

    /**
     * 放入牛奶，味道更好
     */
    public void putMaterial() {
        System.out.println("put in milk");
    }


    /**
     * 在子类覆盖它，让用户去选择
     * @return
     */
    @Override
    protected boolean isPutMaterIal() {
        String userInput = getUserInput();
        if(userInput.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 得到用户输入的内容
     * @return
     */
    private String getUserInput(){
        String readString=null;
        System.out.println("Do you want milk（y/n）?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            readString = br.readLine();
        } catch (IOException e) {
            System.out.println("---异常---"+e);
        }
        if(StringUtils.isEmpty(readString)){
            return "N";
        }else{
            return readString;
        }
    }
}
