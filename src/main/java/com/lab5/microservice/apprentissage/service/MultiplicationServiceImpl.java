package com.lab5.microservice.apprentissage.service;

import com.lab5.microservice.apprentissage.domain.Multiplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generatorFactor();
        int factorB = randomGeneratorService.generatorFactor();
        return new Multiplication(factorA,factorB);
    }
}
