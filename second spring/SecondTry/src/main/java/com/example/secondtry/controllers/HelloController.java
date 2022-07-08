package com.example.secondtry.controllers;

import com.example.secondtry.domain.PrognozaMapper;
import com.example.secondtry.service.WheatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hello")
public String getHelloString()
{
    return "Hello World!";
}

private final WheatherService wheatherService;

    public HelloController(WheatherService wheatherService) {
        this.wheatherService = wheatherService;
    }

@GetMapping("/prognoza")
public String getPrognoza()
{
    PrognozaMapper prognozaMapper = new PrognozaMapper();
    return prognozaMapper.getWeather(wheatherService.getWeather());
}


}
