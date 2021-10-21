package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 描述：
 *
 * @author Wei Wu
 * 2021/10/21 18:11
 */
@RestController
@RequestMapping(value = "/v1")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello, world. date: " + new Date();
    }

}
