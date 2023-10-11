package com.green.day9.ch5;

public class ArrayEx19_T {

    public static void main(String[] args) {
        int[][] score = {
                  { 101, 102, 103 }
                , {  21,  22,  23 }
                , {  31,  32,  33 }
                , {  41,  42,  43 }
                , {  51,  52,  53 }
        };
        int[] sumArr = new int[score[0].length];
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("----------------------------------");
        for(int i = 0; i< score.length; i++) {
            System.out.printf("%d", i+1);
            int sum = 0;
            for(int z = 0; z < score[i].length; z++) {
                int val = score[i][z];
                sumArr[z] += val; // sumArr[z] = sumArr[z] + val
                sum += val;
                System.out.printf("\t%d", val);
            }
            float avg = (float)sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);

        }
        System.out.println("----------------------------------");
        System.out.print("총점");
        for(int ddd : sumArr) {
            System.out.printf("\t%d", ddd);
        }/*
        System.out.println();
        for ( sumArr: score) {
            for ( val: sumArr) {
                System.out.printf("\t%d", val);
            }
        }*/
    }
}