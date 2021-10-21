package com.example.demo;

/**
 * @Desc:
 * @Author: wuwei
 * @Date: 2021/9/20 12:09 下午
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/example/demo/feature"},
        extraGlue = "com.example.demo.config",
        plugin = {"pretty",
                "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        monochrome = false)
public class CucumberTest {


}
