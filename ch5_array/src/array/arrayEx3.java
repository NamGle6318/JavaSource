package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEx3 {
    public static void main(String[] args) {
        // 5명 학생의 수학 성적을 입력 받아서 평균, 총합을 구하기
        int score[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            sc = new Scanner(System.in);
            System.out.printf("%d번째 학생 점수 입력 : ", (i + 1));
            score[i] = sc.nextInt();
        }

        // for (int i : score) {
        // // System.out.printf("%d번째 학생 점수 입력 : ", i + 1);
        // score[i] = sc.nextInt();
        // }

        System.out.println(Arrays.toString(score));

        // 평균, 총합
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        // for (int i : score) {
        // sum += score[i];
        // }
        System.out.printf(" 총합 : %d\n 평균 : %.2f", sum, (float) sum / score.length);
    }
}
