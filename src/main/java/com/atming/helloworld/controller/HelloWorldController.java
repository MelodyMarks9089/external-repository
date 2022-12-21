package com.atming.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CreateTime: 2022-12-19-20:49
 * @Author: Hello77
 * @toUser:
 * @note:
 */
@RestController
@Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        System.out.println("你好世界");
        return "helloworld";
    }

}
