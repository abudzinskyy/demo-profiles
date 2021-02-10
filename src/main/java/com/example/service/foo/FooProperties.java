package com.example.service.foo;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("myservice.foo")
public class FooProperties {

    private String value2;

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
}
