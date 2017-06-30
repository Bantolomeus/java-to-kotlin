package com.bantolomeus.controller;

import com.bantolomeus.model.DistributionCreatorModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DistributionCreatorController {

    @RequestMapping(path = "/getDistribution")
    public Map<Integer, Long> getData(@RequestParam(value="range", defaultValue="10") Integer range,
                                      @RequestParam(value="invocations", defaultValue="10") Long invocations) {

        DistributionCreatorModel distributionCreatorModel = new DistributionCreatorModel();

        return distributionCreatorModel.getDistribution(range, invocations);
    }

}
