package com.example.service.bar;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("myservice.bar")
public class BarProperties {

    private String value1;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
}
