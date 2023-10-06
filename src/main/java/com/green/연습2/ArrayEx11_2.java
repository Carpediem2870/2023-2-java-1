package com.green.연습2;

public class ArrayEx11_2 {
    public static void main(String[] args) {
        int[]num = new int[10];
        int[]cnt = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*10);
            System.out.print(num[i]);
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            cnt[num[i]]++;
            System.out.println(i + "의 개수" + cnt[i]);
        }
        for (int sss :
                num) {
            System.out.println(sss);
        }
    }
}
