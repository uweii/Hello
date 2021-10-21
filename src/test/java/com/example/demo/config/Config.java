package com.example.demo.config;

import com.example.demo.DemoApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Desc:
 * @Author: wuwei
 * @Date: 2021/9/20 2:40 下午
 */
@SpringBootTest(classes = DemoApplication.class)
@CucumberContextConfiguration
public class Config {

}
