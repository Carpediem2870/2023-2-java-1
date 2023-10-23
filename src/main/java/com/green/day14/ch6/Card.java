package com.green.day14.ch6;

public class Card {
    String pattern;
    String denimination;

    public Card(String pattern, String denimination) {
        this.pattern = pattern;
        this.denimination = denimination;
    }

    void printMySelf() {
        System.out.printf("%s (%s)\n", pattern, denimination);
    }
}