package com.example.demo.fegin;

import org.springframework.stereotype.Component;

/**
 * Created by fankq on 2019/1/19.
 */
@Component
public class DemoService1Fallback implements DemoService1Client {
    @Override
    public String test1() {
        return "this is test1's fallback!";
    }
}
