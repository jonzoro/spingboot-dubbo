package com.example.dubbocustomer.service;

import com.example.dubbointerface.DemoInterface;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Reference
    private DemoInterface demoInterface;

    public String sayHi(String name) {
        return demoInterface.sayHi(name);
    }
}
