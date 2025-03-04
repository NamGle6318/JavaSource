package array;

import java.util.Arrays;

public class arrayEx12 {
    public static void main(String[] args) {
        // 2차원 배열 선언
        // 배열 선언시 타입별 기본값 출력
        String[] firstNames = { "kim", "Park", "Yi" };

        String[] name = new String[2];
        System.out.println(Arrays.toString(name)); // null, null

        int[] arr = new int[2];
        System.out.println(Arrays.toString(arr)); // 0, 0

        boolean[] arr2 = new boolean[2];
        System.out.println(Arrays.toString(arr2)); // false, false

        char[] arr3 = new char[2];
        System.out.println(Arrays.toString(arr3)); // ,

        double[] arr4 = new double[2];
        System.out.println(Arrays.toString(arr4)); // 0.0, 0.0
    }
}
