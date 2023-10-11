package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrEx2 {
    public static void main(String[] args) {
        final  int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int MAX = 5;
        int left_diag_cnt = 0, right_diag_cnt = 0;
        int column_cnt = 0, row_cnt = 0;

        int[][] bingo   = new int [SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                bingo[i][j] = i*SIZE + j + 1;
        int called_num, line = 0, call_cnt = 0;

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        x = (int)(Math.random()*SIZE);
                        y = (int)(Math.random()*SIZE);

                        int tmp = bingo[i][j];
                        bingo[i][j] = bingo[x][y];
                        bingo[x][y] = tmp;
                    }
                }

                do {
                    for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++){
                            System.out.printf("%2d ", bingo[i][j]);
                        if (bingo[i][j] == 0)
                            row_cnt++;
                        if (bingo[j][i] == 0)
                            column_cnt++;
                    }

                        System.out.println();
                    }
                        System.out.println();

                        System.out.printf("1~%d의 숫자를 입력하세요. (종료:0) >> ",SIZE*SIZE);
                        String tmp = scanner.nextLine();
                        num = Integer.parseInt(tmp);




                        outer:
                        for (int i = 0; i < SIZE; i++) {
                            if (row_cnt==MAX)
                                line++;
                            if (column_cnt==MAX)
                                line++;
                            if (bingo[i][i] == 0)
                                row_cnt++;
                            if (bingo[i][MAX-1-i] == 0)
                                column_cnt++;
                            for (int j = 0; j < SIZE; j++) {
                                if (bingo[i][j]==num) {
                                    bingo[i][j] = 0;
                                    break outer;
                                }
                            }
                        }

                    if (line == 3) num=0;

                    } while(num != 0);

                }
            }
