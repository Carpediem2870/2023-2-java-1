package com.green.day18.ch7;

import com.green.day15.ch7.Parent;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3); // new 뒤에는 생성자만 올 수 있다. 3개짜리 야구게임 설정
        nbb.start();

    }
}


class NumberBaseball {

    private final int GAME_COUNT;
    private final int[] gameNumbers;  // 레퍼런스 변수와같이 주소값 변경이 안된다.


    public NumberBaseball(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }


    public void start() {
        setRandomNumNotDuplicate();  // 0~9 사이의 랜덤값 중복없이
        getUserInput();

    }

    private void getUserInput() {
        Scanner scan = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ", i + 1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);


        scan.close();
    }

    public boolean isContinueCheckResult(int[] arr) {
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

    public void setRandomNumNotDuplicate() {


        int ran;

        for (int i = 0; i < gameNumbers.length; i++) {
            ran = (int) (Math.random() * 10);
            gameNumbers[i] = ran;
            for (int z = 0; z < gameNumbers.length; z++) {
                if (i == z) {
                    continue;
                }
                if (gameNumbers[i] == gameNumbers[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));
        //        for (int i = 0; i < GAME_COUNT; i++) {
//            gameNumbers[i] = getRandomValue();
//            for (int j = 0; j < i; j++) {
//                if (gameNumbers[i] == gameNumbers[j]){
//                    i--;
//                }
//            }
//        }
    }
}
