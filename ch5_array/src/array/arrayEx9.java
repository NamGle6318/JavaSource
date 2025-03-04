package array;

import java.util.Arrays;

public class arrayEx9 {
    public static void main(String[] args) {
        // 배열의 값의 순서를 무작위로 바꾸는 프로그램
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 1;
        }

        System.out.println(Arrays.toString(numArr));

        // 변수끼리 값을 교환하는 방식
        // int a = 10, b = 15;
        // int tmp = a;
        // a = b;
        // b = tmp;

        // 교환할 위치 임의 생성 : 0~9
        int pos = 0;
        int tmp = 0;

        for (int i = 0; i < 100; i++) {
            pos = (int) (Math.random() * 10);
            tmp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
