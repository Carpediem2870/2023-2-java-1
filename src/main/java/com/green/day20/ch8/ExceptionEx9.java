package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {

        try{
//            Exception e = new Exception("일부러 에러 터트림!!");
//            System.out.println("dddddd");
//            throw e;

            throw new Exception("일부러 크크크");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상적으로 종료되었음");
    }
}
