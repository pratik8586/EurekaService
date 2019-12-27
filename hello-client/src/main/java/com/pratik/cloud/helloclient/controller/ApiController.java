package com.pratik.cloud.helloclient.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author pgaikwad
 */
@RestController
@RequestMapping("/api/v2")
public class ApiController {
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/getResult")
    public String getResult()
    {
        return "client b thik hai";
    }
//    @GetMapping("/getFromServer")
//    public String getFromServer()
//    {
//        String url="http://hello-server/getResult";
//        return restTemplate.getForObject(url,String.class);
//    }
}
