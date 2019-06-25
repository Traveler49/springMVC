package com.lbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController//使用RestController可以不使用@ResponseBody
public class indexController {
    @RequestMapping(value = {"index","show"})
    //@ResponseBody
    public Map<String ,String> index(){
        Map map=new HashMap<String ,String>();
        map.put("1","b");
        map.put("2","d");
        map.put("3","c");
        return map;
    }
}
