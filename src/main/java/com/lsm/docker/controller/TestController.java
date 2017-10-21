package com.lsm.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Map get() {
        Map data = new HashMap();
        data.put("code","200");
        data.put("msg","this is test");
        data.put("data",null);
        return data;
    }
}