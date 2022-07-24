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
        System.out.println("---------------------------\n\n\n");
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
    /*
                1.Razpechataite vsichki futbolisto ot psj sortirani po nomer ;
            2.Razpechataite vsichki futbolisti 1 po otbor , polse nomer
            3 po ispanskata liga;

            v domaina se sluchva 1 metod za vsichkiute

            4. razpechataite vsichki ligi kato na vsqka liga vklyuchete byudjeta ( liga - byudjet)
            5. napravete string koito sudurja slednoto:
            in :

            TEAM:Barca Player1, Player2, Player /ENDTEAM TEAM:Real.....

            6. razpechatai vsichki futbolisti , sortirani i grupirani po durjava ( league->country)

            7. Da se vurne nai-bogatata liga;

            8. da razpechatate vsichkite ligi vklyuchitelno i tehniq average byudjet i sortirame po tozi average byudjet  (ot nai bogata kym nai bedna)

            9. razpechataite spisuk na futbolistite s povtarqshti se nomera
     */
}
