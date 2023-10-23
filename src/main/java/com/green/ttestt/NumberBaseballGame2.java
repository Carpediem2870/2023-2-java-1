package com.green.ttestt;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame2 {
    public static void main(String[] args) {
        NumberBaseball2 nbb = new NumberBaseball2(3);
        nbb.start();
    }
}

class NumberBaseball2 {
    private final int GAME_COUNT;
    private final int[] gameNumbers;


    public NumberBaseball2(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }

    public void start() {
        setRandomNumNotDuplicate2(); //0-9 사이의 랜덤값 중복없이
        getUserInput2();
    }

    private void getUserInput2() {
        Scanner scan = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for(int i=0; i<GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ", i+1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult2(userArr);

        scan.close();
    }

    private boolean isContinueCheckResult2(int[] arr) {
        int strike = 0;
        int ball = 0;
        int out;


        for (int i = 0; i < GAME_COUNT; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i == j) {
                    if (arr[i] == gameNumbers[j]) {
                        strike++;
                    }
                }

                if (i != j) {
                    if (arr[i] == gameNumbers[j]) {
                        ball++;
                    }
                }

            }
        }
                        out = GAME_COUNT - (strike + ball);
        System.out.printf("Strike:%d,ball: %d,out: %d\n", strike, ball, out);
        return false;
    }

    private void setRandomNumNotDuplicate2() {
        for(int i=0; i<GAME_COUNT; i++) {
            gameNumbers[i] = getRandomValue2();
            for(int z=0; z<i;z++) {
                if(gameNumbers[i] == gameNumbers[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));
    }


    private int getRandomValue2() {
        return (int)(Math.random() * 10);
    }
}