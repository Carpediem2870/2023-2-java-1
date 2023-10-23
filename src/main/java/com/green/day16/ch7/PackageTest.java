package com.green.day16.ch7;


import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.Parent; // ch7.Paraent 클래스만 불러오는거
//import com.green.day15.ch7.*; ch7패키지내부에 클래스 전부다 불러오는거

import static com.green.day13.ch6.MyMath2.staticAbs;  // 나랑 패키지 및 클래스가 다른 static 메서드 혹은 static맴버필드를 같은 클래스에 있는것처럼 사용
import static com.green.day13.ch6.MyMath2.staticNum;

public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        // com.green.day15.ch7.Parent;
        // com.green.day15.ch7.Child child;

        MyMath2.staticAbs(10); // 임포트를 안하고 쓰는방법 (이게 어디서 땡겨온건지 쉽게 파악가능...개인취향)
        staticAbs(12); // 임포트를 하고 쓰는방법
        MyMath2.staticNum = 12;
        staticNum = 10;
    }
}