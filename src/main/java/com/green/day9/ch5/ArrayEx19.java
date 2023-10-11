package com.green.day9.ch5;

public class ArrayEx19 {

    // 번호   국어  영어  수학  총점  평균
    // -------------------------------
    // 1    101   102   103  306  102.0
    // 2     21    22    23  66  ...
    // -------------------------------
    // 총점   ??    ??    ??
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 }
                , { 21, 22, 23 }
                , { 31, 32, 33 }
                , { 41, 42, 43 }
                , { 51, 52, 53 }
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;
        int sum = 0;
        float avg = 0.0f;
        System.out.println("번호   국어   영어   수학   총점   평균");
        System.out.println("------------------------------");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d  ",i+1);
            int []arr = score[i];

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                System.out.printf(" %5d", score[i][j]);
                sum += score[i][j];
            }
            System.out.printf("    %3d",sum);
            avg = (float)sum/3f;
            sum = 0;
            System.out.printf("   %3.1f", avg);
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.printf("총점 : %d  %d  %d",korTotal,engTotal,mathTotal);
    }
}


       /* for (int i = 0; i < score[i].length; i++) {
        sum = 0;
        for (int j = 0; j < score.length; j++) {
        sum += score[j][i];

        }

        System.out.printf("  %d  ", sum);
        }
        }
        }*/