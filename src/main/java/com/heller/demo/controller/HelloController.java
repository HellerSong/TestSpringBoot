package com.heller.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>Summary : </p>
 * <p>Authors : Heller Song (HellerSong@Outlook.com)</p>
 * <p>Creation: 2018/10/31 3:17 PM</p>
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello requested");
        return "hello~~";
    }

    @GetMapping("/index")
    public String index() {
        System.out.println("index requested");
        return "index";
    }

}
