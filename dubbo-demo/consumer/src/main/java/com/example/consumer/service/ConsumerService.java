package com.example.consumer.service;

import com.example.api.DemoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author 张向兵
 * @date 2019-05-16.
 */
@Service
public class ConsumerService {

    @Reference
    private DemoApi demoApi;

    public String sayHello(String name) {
        return demoApi.sayHello(name);
    }
}
