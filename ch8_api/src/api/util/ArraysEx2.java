package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        // 검색 - 배열안에 53이라는 숫자가 있는지 확인
        Integer[] arr;
        arr = new Integer[] { 93, 47, 53, 46, 71 };

        // 이진검색
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 53));

        Integer[] arr1;
        Integer[] arr2;
        arr1 = new Integer[] { 93, 47, 53, 46, 71 };
        arr2 = new Integer[] { 93, 47, 53, 46, 71 };

        // 배열비교
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
