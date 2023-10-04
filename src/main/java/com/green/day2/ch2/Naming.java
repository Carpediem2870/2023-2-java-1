package com.green.day2.ch2;

import java.util.Date;  // java.util에 있는 Date 클래스를 사용한다.

public class Naming {
    public static void main(String[] args) {
//        1. 대소문자 구별. 길이제한 없다.
//        int abc, aBc, abC 는 다 다른내용이고 sdfkdljsalf이렇게 길이제한 없음.

//        2. 이름으로 예약어 사용 x
//        int int, void, static

//        3. 숫자 시작 노노 (처음만 아니면 된다)
//        int 1ab; 이렇게 1로시작 하는거 불가능
//        int a1b, ab1; 이런거는 가능

//        4. 특수 문자 _, $만 가능
//        int _ab, $ab;

//-----------------------------------------------

//        케이스 기법
//        hello my name is won

//        1. 파스칼 케이스 기법
//        HelloMyNameIsWon    대문자로 시작

//        2. 카멜 케이스 기법 (변수명, 메소드명)
//        helloMyNameIsHong   첫 단어만 소문자로 사용

//        3. 케밥 케이스 기법
//        hello-my-name-is-hong  자바에서는 사용불가(특수문자 -를 별도로 사용하기 때문에) css에서 쓰는 기법.

//        4. 스네이크 케이스 기법
//        hello_my_name_is_hong  자바에서 사용은 가능하나 사용하지 않음.


        //-----------------------------------------------


//        상수는 전부 대문자 구분은 언더바
//        PI, MAX_NUMBER
//        final int PI, MAX_NUMBER = 10;  상수는 한번 입력된 값이 변경되지 않는것
//        final 이 붙으면 상수가됨.

        Date today = new Date();  // 참조 레퍼런스타입 (첫 글짜 대문자)
    }
}
