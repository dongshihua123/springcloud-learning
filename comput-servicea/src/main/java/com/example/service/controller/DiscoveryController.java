package com.example.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@RestController
public class DiscoveryController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    private AtomicInteger acount = new AtomicInteger(0);

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        acount.addAndGet(1);
        logger.info("/add, host:" + ", service_id:" + acount + ", result:" + r);
        return r;
    }

}
