package array;

import java.util.Arrays;

public class arrayEx13 {
    public static void main(String[] args) {
        // 2차원 배열 (행, 열)

        // 2차원 배열 선언및 생성
        int[][] arr1 = new int[2][2];

        arr1[0][0] = 73;
        arr1[0][1] = 83;
        arr1[1][0] = 63;
        arr1[1][1] = 53;

        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr1[i].length; j++) {
        // System.out.printf(arr1[i][j] + "\t");
        // }
        // System.out.println();
        // }
        // for (int[] tmp : arr1) { // tmp = arr1의 배열단위로 가져옴 [73, 83] [63, 53]
        // for (int is2 : tmp) {
        // System.out.print(is2 + "\t");
        // }
        // System.out.println();

        // }

        int[][] arr2 = {
                { 100, 100, 100 },
                { 20, 30, 40 }
        };

        // for (int[] tmp : arr2) {
        // for (int is : tmp) {
        // System.out.print(is + "\t");
        // }
        int sum = 0;
        for (int[] tmp : arr2) {
            for (int is2 : tmp) {
                sum += is2;
            }
        }

        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < arr2[i].length; j++) {
        // sum += arr2[i][j];
        // }
        // }
        System.out.println(sum);
    }
}
