package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;

        int[] arr = {10, 20, 30}; // 배열 작성 (대입연산자 사용)

        String [] arr2 = { "A", "B", "가가", "나나" }; // 스트링 타입 배열

        int [] arr3 = new int[3];//[3] 방 갯수 3개 0,1,2번방 // 3개짜리 정수만 저장할 수 있는 방만 만듦 따라서 각방에는 0이 들어가있음.
        int arr4 [] = new int[30]; // 이렇게도 가능하고 자바는 위의방법과 아래방법 둘 다 사용가능 아래껀 C언어 스타일

        arr[0] = 200; // 기존0번방에 있는 값이 10이던걸 200으로 바꿀 수 있음.

        System.out.println("arr[0]: " + arr[0]); // 배열 읽기
        System.out.println("arr[1]: " + arr[1]); // 배열 읽기
        System.out.println("arr[2]: " + arr[2]); // 배열 읽기

        System.out.println("arr.length : " + arr.length);  // 배열이 가지고있는 공간 수 = 길이
    }
}
