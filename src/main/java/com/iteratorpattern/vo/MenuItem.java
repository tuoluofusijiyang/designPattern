package com.iteratorpattern.vo;

import java.math.BigDecimal;

/**
 * @program: test
 * @description: 菜单bean类
 * @author: Mr.Yang
 * @create: 2019-01-01 15:24
 **/
public class MenuItem {
    private String name;
    private String description;
    BigDecimal price;

    public MenuItem(String name,String description ,Double price){
        this.name=name;
        this.description=description;
        String priceString = String.valueOf(price);
        BigDecimal bigDecimal = new BigDecimal(priceString);
        this.price=bigDecimal;
    }
    public String getName() {
        return name;
    }

    public MenuItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MenuItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public MenuItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
