package com.green.day4.ch4;

public class Switch {
    public static void main(String[] args) {
        int val = 10;

        switch(val) {

            //디폴트위치는 어디든 가능하고 안쓸 경우도 있다
//            default:
//                System.out.println("1~3이 아니다");

            case 1:
                System.out.println("1이다");
                break;

            case 2:
                System.out.println("2이다");

                break;

            case 4:
                System.out.println("3이다");
                break;

            default:
                System.out.println("1~3이 아니다");

        }
        // break; 만나면 스위치문을 벗어나 여기로 빠져나오면서 종료
    }
}
