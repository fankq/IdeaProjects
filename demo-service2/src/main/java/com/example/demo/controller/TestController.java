package com.example.demo.controller;

import com.example.demo.fegin.DemoService1Client;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fankq on 2019/1/15.
 */
@RestController
@RequestMapping("/getTest")
public class TestController {
//    @Autowired
//    private RestTemplate template;
    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private DemoService1Client demoService1Client;

    @RequestMapping("/test1")
    public String getTest1(){
//        ServiceInstance  instance=  loadBalancerClient.choose("demo-service1");
//        String url = MessageFormat.format("http://{0}:{1}/test/test1",instance.getHost(),String.valueOf(instance.getPort()));

//        System.out.println(url);
        //return template.getForObject("http://demo-service1/test/test1",String.class);
        return demoService1Client.test1();
    }

    @RequestMapping("/demo-service1")
    public Object getTest2(){

        return eurekaClient.getInstancesByVipAddress("demo-service1",false);
    }
}
