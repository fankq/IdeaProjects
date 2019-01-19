package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fankq on 2019/1/15.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("test1")
    public String test1(HttpServletRequest request){

        return request.getServerPort()+"test1";
    }
}
