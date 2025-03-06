package oop;

import java.util.Arrays;

// 값 복사(primitiveParam) : 출력문 썼을때 그 변수의 값이 나오는 것들
// 주소 복사(refrenceParam) : 출력문 썼을때 주소가 출력되는것들
public class referenceParamEx2 {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4 };
        printArr(arr); // 주소복사
        System.out.println(Arrays.toString(arr));
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sumArr(arr));
    }

    static void printArr(int[] arr) {
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) { // 버블정렬 알고리즘으로 오름차순 정렬
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
