package com.example.consumer.controller;

import com.example.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张向兵
 * @date 2019-05-16.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("test")
    public String test(String name) {
        return consumerService.sayHello(name);
    }

}
