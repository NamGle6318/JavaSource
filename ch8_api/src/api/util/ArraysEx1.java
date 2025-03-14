package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {

        Integer[] arr;
        arr = new Integer[] { 93, 47, 53, 46, 71 };
        System.out.println(Arrays.toString(arr));
        // Arrays.toString(args);
        // Arrays.asList("");

        // 오름차순 정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬 : sort(T, Comparator) / T = 객체
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));

        // 문자 정렬
        Character[] characters = { 'a', 'k', 'b', 't', 'o' };

        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));

        Arrays.sort(characters, Comparator.reverseOrder());
        System.out.println(Arrays.toString(characters));

    }
}
