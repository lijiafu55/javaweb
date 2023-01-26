package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
  @ 2023， 01， 23， 08，08
  @ 15303  springmvc
  @ 15303  com.mvc 8:08
*/
@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }
    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
    @RequestMapping(
            value = {"/test"},
            method = {RequestMethod.GET,RequestMethod.POST}
            // RequestMethod.GET,
    )
    public String totest(){
        return "test";
    }



}
