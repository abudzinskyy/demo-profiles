package com.example.service.foo;

import com.example.service.MyService;

public class FooService implements MyService {

    private final FooProperties properties;

    public FooService(FooProperties properties) {
        this.properties = properties;
    }

    @Override
    public void print() {
        System.out.println("FooService.properties = " + properties);
    }
}
