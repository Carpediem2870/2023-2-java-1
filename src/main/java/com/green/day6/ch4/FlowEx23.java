package com.green.day6.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;
//        4 - I can do it.
//        3 - I can do it.
//        2 - I can do it.
//        1 - I can do it.
//        0 - I can do it.
        while(i !=0) { // while(i > 0) 해도됨
            i--;
            System.out.printf("%d - I can do it.%n", i);  // %n = \n
        }
    }
}
