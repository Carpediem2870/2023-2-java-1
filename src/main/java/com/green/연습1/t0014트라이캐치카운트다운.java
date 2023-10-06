package com.green.연습1;

public class t0014트라이캐치카운트다운 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("카운트다운을 시작합니다.");
        while (i-- != 0) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(i);
                e.printStackTrace();
            }
        }
        System.out.println("GAME OVER");
    }
}
