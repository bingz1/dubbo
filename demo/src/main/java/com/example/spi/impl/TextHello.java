package com.example.spi.impl;

import com.example.spi.HelloInterface;

/**
 * @author 张向兵
 * @date 2019-05-15.
 */
public class TextHello implements HelloInterface {

    @Override
    public void sayHello() {
        System.out.println("Text Hello");
    }
}
