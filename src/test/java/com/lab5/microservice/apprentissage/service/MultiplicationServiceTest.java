package com.lab5.microservice.apprentissage.service;

import com.lab5.microservice.apprentissage.domain.Multiplication;
import com.lab5.microservice.apprentissage.service.MultiplicationService;
import com.lab5.microservice.apprentissage.service.RandomGeneratorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MultiplicationServiceTest {
    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest(){
        given(randomGeneratorService.generatorFactor())
                .willReturn(50,30);
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        assertEquals(50,multiplication.getFactorA());
        assertEquals(30,multiplication.getFactorB());
        assertEquals(1500,multiplication.getResult());

    }



}
