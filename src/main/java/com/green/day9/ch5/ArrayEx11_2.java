package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11_2 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            cntArr[numArr[i]]++;
        }
            for (int j = 0; j < numArr.length; j++) {
                System.out.printf("%d의 개수: %d\n", j,cntArr[j]);
            }
        // numArr 각 방에 0~9 사이에 랜덤값을 대입한다. (중복 허용)
        // cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        // 0~9의 개수를 출력

    }
}
