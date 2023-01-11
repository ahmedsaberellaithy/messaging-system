package com.phone.messagingsystem.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("health")
@Slf4j
public class HealthController {
    @GetMapping()
    public String healthCheck() {
        log.warn("Health Check Triggered");
        return "I am alive";
    }
}
