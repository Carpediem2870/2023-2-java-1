package com.green.day9.ch5;

public class ArrayEx19_2 {

    // 번호   국어  영어  수학  총점  평균
    // -------------------------------
    // 1    101   102   103  306  102.0
    // 2     21    22    23  66  ...
    // -------------------------------
    // 총점   ??    ??    ??
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
                {51, 52, 53}
        };

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("--------------------------");
        int k = 0;
        int s = 0;
        int e = 0;
//        int sum = 0;
//        double avg = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; i < score.length; i++) {
                k += score[i][j];
                s += score[i][j + 1];
                e += score[i][j + 2];
//                sum += score[i][j] + score[i][j + 1] + score[i][j + 2];
//                avg += (double)((score[i][j] + score[i][j + 1] + score[i][j + 2]) / 3) / 5;
                System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", i + 1, score[i][j], score[i][j + 1], score[i][j + 2], score[i][j] + score[i][j + 1] + score[i][j + 2], (double) (score[i][j] + score[i][j + 1] + score[i][j + 2]) / score[i].length);
            }
        }
        System.out.println("--------------------------");
        System.out.printf("총점\t%d\t%d\t%d\n", k, s, e);
    }
}