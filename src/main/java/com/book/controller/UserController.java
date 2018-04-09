package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2018/4/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/get")
    @ResponseBody
    public String getUser(){
        return "Hello World";
    }
}
