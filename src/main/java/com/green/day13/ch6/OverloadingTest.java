package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(10.2D);
    }

    void print(){}

    void print(int n1){}
    void print(int n1, int n2){}
    // void print(int n3, int n4){}  바로윗줄과 인스턴스 객체 형태가 같기 때문에 안됨
    void print(String n3, int n4){} // 위와 다르게 인스턴스 객체가 (int, int)가 아니라 (String, int) 기때문에 가능
}
