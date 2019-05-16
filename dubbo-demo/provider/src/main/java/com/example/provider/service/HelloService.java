package com.example.provider.service;

import com.example.api.DemoApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 张向兵
 * @date 2019-05-16.
 */
@Service
public class HelloService implements DemoApi {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot with dubbo-2.7.1)";
    }

}
