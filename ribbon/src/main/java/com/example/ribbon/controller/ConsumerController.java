package com.example.ribbon.controller;

import com.example.ribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {


    @Autowired
    private ComputeService service;

    @RequestMapping("/add")
    public String add() {
        return service.addService();
    }


}
