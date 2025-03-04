package array;

import java.util.Arrays;

// 2차원 배열

public class arrayEx6 {
    public static void main(String[] args) {
        int arr[] = { 78, 99, 52, 35, 14 };

        // 기존 배열인 arr에 공간을 추가로 할당하려면
        // 1. 새로운 배열에 더 큰 공간 생성 => 기존 배열의 값을 복사
        // 2. System.arraycopy() : 범위를 지정해서 한번에 복사 가능

        // 방법 1.
        int tmp[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));

        // 방법 2.
        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
        // length);
        // (원본 배열, int 원본배열에서 복사할 시작위치, 새로운 배열, 새로운 배열에서 붙혀넣기할 시작위치, 복사할 개수);
        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 0, 5);
        System.out.println(Arrays.toString(tmp2));
    }
}
