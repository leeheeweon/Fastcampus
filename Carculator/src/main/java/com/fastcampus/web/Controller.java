package com.fastcampus.web;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/part1/index")
    public String part1(){
        return "/part1/index";
    }

    @RequestMapping("/part2/index")
    public String part2(){
        return "/part2/index";
    }

    @RequestMapping("/part3/index")
    public String part3(){
        return "/part3/index";
    }

}
