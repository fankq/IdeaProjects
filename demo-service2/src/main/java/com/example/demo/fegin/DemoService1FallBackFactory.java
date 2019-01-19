package com.example.demo.fegin;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by fankq on 2019/1/19.
 */
@Component
public class DemoService1FallBackFactory implements FallbackFactory<DemoService1Client>{
    @Override
    public DemoService1Client create(Throwable throwable) {
        return new DemoService1Client(){

            @Override
            public String test1() {
                System.out.println(throwable.getMessage());
                return "test1 is fallBack!"+throwable.getMessage();
            }
        };
    }
}
