package com.example.service;

import com.example.service.bar.BarProperties;
import com.example.service.bar.BarService;
import com.example.service.foo.FooProperties;
import com.example.service.foo.FooService;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;

import javax.inject.Singleton;

@Factory
public class MyFactory {

    @Singleton
    @Requires(property="myservice.type", value="bar")
    public BarService myService(BarProperties properties) {
        return new BarService(properties);
    }


    @Singleton
    @Requires(property="myservice.type", value="foo")
    public FooService myService(FooProperties properties) {
        return new FooService(properties);
    }
}
