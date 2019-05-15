package com.example.spi;

import java.util.ServiceLoader;

/**
 * @author 张向兵
 * @date 2019-05-15.
 */
public class SpiMain {

    public static void main(String[] args) {

        ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);

        if (loaders != null) {

            for (HelloInterface helloInterface : loaders) {
                helloInterface.sayHello();
            }
        }

    }
}
