package com.example.demo.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by fankq on 2019/1/17.
 */
@FeignClient(name = "demo-service1"
//        , fallback= DemoService1Fallback.class
        ,fallbackFactory=DemoService1FallBackFactory.class
)
public interface DemoService1Client {

    @GetMapping(value = "/test/test1")
    String test1();
}
