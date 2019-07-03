package com.abstractfactorypattern.material.factory;

import com.abstractfactorypattern.material.vo.Address;

/**
 * @program: designPattern
 * @description: 材料工程
 * @author: Mr.Yang
 * @create: 2018-11-20 20:58
 **/
public interface  MaterialFactory {
    /**
     * 创建材料方法
     * @return
     */
     Address selectAddress();


}
