package com.example.secondtry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String gimmeString()
    {
        return "rabotiiii";
    }

    @GetMapping("/new")
    public List<Integer> gimmeIntegers() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            integers.add(i);
        }
    return integers;
    }
}
