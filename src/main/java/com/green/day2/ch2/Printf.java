package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args) {
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello\n");

        System.out.println("---------------------------");

        System.out.printf(""); //

        System.out.printf("하이\n");
        System.out.printf("하이\n");
        System.out.printf("하이\n");

        String name = "홍길동";
        int age = 23;
        char bloodType = 'B';
        float height = 178.8f;

        //제 이름은 홍길동이고, 나이는 23세이고, 혈액형은 B형이고, 키는 178.8cm 입니다.

        System.out.printf("제 이름은 " + name + "이고, ");
        System.out.printf("나이는 " + age + "세 이고 ");
        System.out.printf("혈액형은 " + bloodType + "이고, ");
        System.out.printf("키는 " + height + "cm입니다.");

        System.out.println();

        System.out.printf("제 이름은 %s이고, 나이는 %03d세이고, 혈액형은%c형이고, 키는 %.1fcm입니다."
        , name, age, bloodType, height);
    }
}
