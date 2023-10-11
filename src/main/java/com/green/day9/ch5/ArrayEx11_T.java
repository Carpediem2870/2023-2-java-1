package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11_T {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            int rVal = (int)(Math.random()*LEN); // 0~9 랜덤값 생성됨.
            numArr[i] = rVal;
        }
        System.out.println(Arrays.toString(numArr));

/*        cntArr[1] = cntArr[1]+1;
        cntArr[1] = cntArr[1]+1;*/ // 1번방에 1씩 추가 예문

        for (int i = 0; i < LEN; i++) {
            int val = numArr[i];
            cntArr[val] = cntArr[val]+1;
        }
//            cntArr[val]++;
//            cntArr[numArr[i]]++;

//        <향상된 for문>
//        for (int name : numArr) {
//            cntArr[name]++;
//        }


        for (int i = 0; i < LEN; i++) {
            System.out.printf("%d의 수: %d\n",i,cntArr[i]);
        }
        // numArr 각 방에 0~9 사이에 랜덤값을 대입한다. (중복 허용)
        // cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        // 0~9의 개수를 출력

    }
}
