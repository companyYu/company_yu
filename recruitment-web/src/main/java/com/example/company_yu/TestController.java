package com.example.company_yu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/4/22.
 */
@RestController
@RequestMapping(value = "/i/testController")
public class TestController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello zhao";
    }
}
