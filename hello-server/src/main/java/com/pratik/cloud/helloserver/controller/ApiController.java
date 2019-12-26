package com.pratik.cloud.helloserver.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author pgaikwad
 */
@RestController
@RequestMapping("/")
public class ApiController {

    @GetMapping("getResult")
    public String getResult() {
        return "sab theek hai ..!!";
    }


}
