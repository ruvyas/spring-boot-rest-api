package vyas.rushi.io.corerest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String laneCount;

    @Value("${tollstart}")
    String tollStart;

    @GetMapping("/default")
    public String TollInfo(){
        return "Your rate is: " + rate + ", number of lanes is: " + laneCount + ", toll start time is: " + tollStart;
    }
}
