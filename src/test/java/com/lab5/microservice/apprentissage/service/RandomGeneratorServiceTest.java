package com.lab5.microservice.apprentissage.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RandomGeneratorServiceTest {
    @Autowired
    private RandomGeneratorService randomGeneratorService;


    @Test
    public void generateRandomFactorIsBeteweenExpectedLimits() throws Exception {
        List<Integer> randomFactors = IntStream.range(0,1000).map(i ->randomGeneratorService.generatorFactor())
                                                            .boxed().collect(Collectors.toList());
        assertThat(randomFactors).containsOnlyElementsOf(IntStream.range(11,100).boxed().collect(Collectors.toList()));
    }
}
