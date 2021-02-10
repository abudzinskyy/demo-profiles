package com.example.service.bar;

import com.example.service.MyService;

public class BarService implements MyService {

    private final BarProperties properties;

    public BarService(BarProperties properties) {
        this.properties = properties;
    }

    @Override
    public void print() {
        System.out.println("BarService.properties = " + properties);
    }
}
