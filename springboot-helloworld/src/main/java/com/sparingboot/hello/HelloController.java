package com.sparingboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 2017/6/19 0019.
 * @Author chenfei
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}