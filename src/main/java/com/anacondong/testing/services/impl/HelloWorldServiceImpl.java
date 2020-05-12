package com.anacondong.testing.services.impl;


import com.anacondong.testing.services.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloWorldServiceImpl implements HelloWorldService {

    @Value("${name:DefualtValue}")
    private String name;

    @Override
    public String getHelloMessage() {
        return "Hello " + this.name;
    }
}
