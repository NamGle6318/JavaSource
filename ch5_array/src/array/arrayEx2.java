package array;

import java.lang.reflect.Array;
import java.util.Arrays;

//배열 

public class arrayEx2 {
    public static void main(String[] args) {
        // 10의 범위를 int 형의 배열을 선언
        int[] arr = new int[10];
        // int arrr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        // 배열 요소의 값 확인
        // 1) for문 사용 : 원하는 형태로 출력 가능
        // 2) 향상된 for문 : 1)의 장점과 같음
        // 3) Arrays.toString(배열명) : 정해진 형식 그대로 출력 [배열요소 출력] = 확인용

        // System.out.println(Arrays.toString(arr)); // 배열의 data 전부를 출력 : [10, 20, 30,
        // 40, 50, 60, 70, 80, 90, 100]

        // 향상된 for문

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " "); // i가 arr 배열의 i번째값을 의미
        }
    }
}
