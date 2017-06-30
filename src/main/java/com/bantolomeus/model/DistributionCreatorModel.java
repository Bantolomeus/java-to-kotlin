package com.bantolomeus.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DistributionCreatorModel {

    public Map<Integer, Long> getDistribution(Integer range, Long invocations) {

        Map<Integer, Long> distribution = new HashMap<>();

        Random randomGenerator = new Random();


        for (Integer i = 0; i < invocations; i++) {
            Integer randomNumber = randomGenerator.nextInt(range);
            Long currentNumberPlusOne = distribution.getOrDefault(randomNumber, 0L) + 1L;
            distribution.put(randomNumber, currentNumberPlusOne);
        }

        return distribution;
    }
}
