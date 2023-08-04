package com.demo.controllers;

import com.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/kafka-demo")
public class KafkaController {
    @Autowired
    private Producer producer;

    @GetMapping("produce")
    public void getMessageFromClient(@RequestParam String message){
        producer.sendMsgToTopic(message);

    }
}
