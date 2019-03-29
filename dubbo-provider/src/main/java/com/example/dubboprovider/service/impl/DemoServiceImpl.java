package com.example.dubboprovider.service.impl;

import com.example.dubbointerface.DemoInterface;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoInterface {
    @Override
    public String sayHi(String name) {
        return "Hello " + name;
    }
}
