package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        changeVal(num);
        System.out.println("<1> num : " + num);

        NumBox nb = new NumBox(); // 100주소생성

        System.out.println("(1)nb.num : " + nb.num);
        nb.num = 30;
        System.out.println("(2)nb.num : " + nb.num);
        changeVal(nb); // 찾아가는조건은 메소드명같고 * 참조변수의 이름이 같아야 찾아감
        System.out.println("(3)nb.num : " + nb.num);


    }

    public static void changeVal(int num) {
        System.out.println("changeVal - int");
        num = 10;
    }

    public static void changeVal(NumBox nb2) { // 100주소
        System.out.println("changeVal - NumBox");
        nb2 = new NumBox(); // 200주소
        nb2.num = 10;
    }
}

class NumBox {
    int num;
}