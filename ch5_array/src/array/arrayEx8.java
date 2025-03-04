package array;

import java.util.Arrays;

// 2차원 배열

public class arrayEx8 {
    public static void main(String[] args) {
        // 배열에 저장된 값 중에서 최대값과 최소 값 구하기
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.printf("최대 값 : %d\n", max);
        System.out.printf("최소 값 : %d\n", min);
    }
}
