package array;

import java.util.Arrays;

// 0번칸과 나머지 칸을 비교
// 가장 작은 수를 0번칸에 배치
// 1번칸과 나머지 칸을 비교
// 가장 작은 수를 1번칸에 배치
public class arrayEx11 {
    public static void main(String[] args) {
        // 정렬 (오름, 내림차순) : 메소드 이용시 간단
        // 오름차순 정렬
        int score[] = { 75, 88, 91, 33, 100, 55, 95 };
        int temp = 0;
        int n = score.length;
        int min;
        System.out.println(Arrays.toString(score));
        // i = 0~6
        // j = 0~

        // 버블정렬 알고리즘 / to-do : 코드의 흐름을 모르겠음, j + 1의 의미
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - (i + 1); j++) { // score.length - (i + 1) = 0~6 1~5 2~4 ///////3~3 2 1 0
                if (score[j] > score[j + 1]) {
                    temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(score));
    }

}