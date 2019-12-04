package com.lab5.microservice.apprentissage.domain;

public class Multiplication {
    private int result;
    private int factorA;
    private int factorB;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = this.factorA * this.factorB;
    }

    public int getResult() {
        return result;
    }

    public int getFactorA() {
        return factorA;
    }

    public void setFactorA(int factorA) {
        this.factorA = factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public void setFactorB(int factorB) {
        this.factorB = factorB;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "result=" + result +
                ", factorA=" + factorA +
                ", factorB=" + factorB +
                '}';
    }
}
