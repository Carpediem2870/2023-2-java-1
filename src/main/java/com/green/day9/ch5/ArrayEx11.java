package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        int []count = new int[LEN];
        int num = 0;

        for (int i = 0; i < LEN; i++) {
            int rIdx = (int)(Math.random()*10);
                numArr[i] = rIdx;
        }
        System.out.println(Arrays.toString(numArr));


        for (int i = 0; i < LEN; i++) {

            for (int j = 0; j < LEN; j++) {
                if (i == numArr[j]) {
                    num = num+1;
                }
                cntArr[i] = num;
            }
            num = 0;
            System.out.printf("%d의 개수: %d\n", i, cntArr[i]);
        }

        // numArr 각 방에 0~9 사이에 랜덤값을 대입한다. (중복 허용)
        // cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        // 0~9의 개수를 출력

    }
}
