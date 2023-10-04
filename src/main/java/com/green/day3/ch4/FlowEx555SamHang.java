package com.green.day3.ch4;

import java.util.Scanner;

class FlowEx555SamHang {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'C', ttt = ' ';
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 A학점 출력
        //1의 자리수가 8이상이면 +, 3이하면 -, 나머지는 없음(빈칸)

        //예를 들어 98점 > A+ 출력
        //          83점 > B-출력
        //          75 ~ 79 ~ 71 > C

        if (score >= 90) {

            if (score >= 98) {
                System.out.println("당신의 학점은 A" + (score >= 98 ? '+' : '-') + "입니다.");

            } else if (score >= 94) {System.out.println("당신의 학점은 A입니다.");
            } else if (score < 94) {System.out.println("당신의 학점은 A" + (score < 94 ? '-' : '-') + "입니다.");

            } else {
                System.out.println("당신의 학점은 A입니다.");
            }

            } else if (score >= 80) {
            if (score >= 88) {System.out.println("당신의 학점은 B" + (score >= 88 ? '+' : '-') + "입니다.");
            }   else if (score > 84) {
            System.out.println("당신의 학점은 B입니다.");
            } else if (score <= 84) {
                System.out.println("당신의 학점은 B" + (score <= 84 ? '-' : '-') + "입니다.");
            }
            else {
                System.out.println("당신의 학점은 B입니다.");
            }

            } else {
            System.out.println("당신의 학점은 C입니다.");

            }
        }
    }



