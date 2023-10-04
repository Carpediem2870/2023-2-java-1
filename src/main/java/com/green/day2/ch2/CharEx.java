package com.green.day2.ch2;

public class CharEx {
    public static void main(String[] args) {
        char ch = 'A';
        int val = 66;

        System.out.printf("%c: %d\n", ch, (int)ch);

        System.out.printf("%c: %d\n", (char)val, val);   // (char)val 은 아스키코드 66 'B'의 대문자 형태
    }
}
