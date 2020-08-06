package com.uwjx.iot.cloud.api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "list")
    public String list(){
        return "list webs";
    }
}
