package com.ldf.chapter1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
   public String hello() {
        return "Hello,这是我第一个Spring_Boot项目！";
    }


    @RequestMapping("say")
    public String say() {
        return "say,这是我第一个Spring_Boot项目！";
    }
}
