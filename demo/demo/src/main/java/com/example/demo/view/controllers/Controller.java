package com.example.demo.view.controllers;

import com.example.demo.domain.services.InfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final InfoService infoService;

    public Controller(InfoService infoService) {
        this.infoService = infoService;
    }


    @GetMapping("/")
    public void get() {
        infoService.firstTask();
        System.out.println("---------------------------\n\n\n");
        infoService.secondTask();
        System.out.println("---------------------------\n\n\n");
        infoService.thirdTask();
        System.out.println("---------------------------\n\n\n");
        infoService.forthTask();
        System.out.println("---------------------------\n\n\n");
        infoService.fifthTask();
        System.out.println("---------------------------\n\n\n");
        infoService.sixthTask();
        System.out.println("---------------------------\n\n\n");
        infoService.seventhTask();
        System.out.println("---------------------------\n\n\n");
        infoService.eightTask();
        System.out.println("---------------------------\n\n\n");
        infoService.ninthTask();
        System.out.println("---------------------------\n\n\n");
    }
}
