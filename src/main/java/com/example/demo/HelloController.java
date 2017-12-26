package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e6gps on 2017/12/25.
 */
@RestController
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        System.out.print("hello world");
        return "Hello World";
    }
}
