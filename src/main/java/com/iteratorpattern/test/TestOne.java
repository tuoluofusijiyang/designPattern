package com.iteratorpattern.test;

/**
 * @program: test
 * @description: 测试1
 * @author: Mr.Yang
 * @create: 2019-01-01 15:38
 **/
public class TestOne {
    /*//打印菜单--菜类和汤类，需要遍历两次，如果再有一个会变成三次，四次…………
    public static void main(String[] args) {
        ArrMenu arrMenu = new ArrMenu();
        MenuItem[] items = arrMenu.getItems();
        for (int i = 0; i < items.length; i++) {
            MenuItem item = items[i];
            System.out.println("item name:"+item.getName());
            System.out.println("item description:"+item.getDescription());
            System.out.println("item price:"+item.getPrice());
        }
        ListMenu listMenu = new ListMenu();
        ArrayList listMenuItems = listMenu.getItems();
        for (int i = 0; i < listMenuItems.size(); i++) {
            MenuItem item = (MenuItem) listMenuItems.get(i);
            System.out.println("item name:"+item.getName());
            System.out.println("item description:"+item.getDescription());
            System.out.println("item price:"+item.getPrice());
        }
    }*/
}
