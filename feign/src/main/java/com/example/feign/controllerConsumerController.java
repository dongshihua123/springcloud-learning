package com.example.feign;

import com.example.feign.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping("/add")
    public Integer add() {
        return computeClient.add(10, 20);
    }

}
