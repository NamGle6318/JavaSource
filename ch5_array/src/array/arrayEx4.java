package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEx4 {
    public static void main(String[] args) {
        // n명 학생의 수학 성적을 입력 받아서 평균, 총합을 구하기
        Scanner sc = new Scanner(System.in);
        int score[]; // 배열을 선언만 함, 나중에 범위를 넣을 수 있음

        System.out.print("학생의 수를 입력하세요 :");
        score = new int[sc.nextInt()];

        // System.out.println("첫 번째 학생 점수 입력");
        // score[0] = sc.nextInt();
        // System.out.println("두 번째 학생 점수 입력");
        // score[1] = sc.nextInt();
        // System.out.println("세 번째 학생 점수 입력");
        // score[2] = sc.nextInt();
        // System.out.println("네 번째 학생 점수 입력");
        // score[3] = sc.nextInt();
        // System.out.println("다섯 번째 학생 점수 입력");
        // score[4] = sc.nextInt();

        for (int i = 0; i < score.length; i++) {
            sc = new Scanner(System.in);
            System.out.printf("%d번째 학생 점수 입력 : ", (i + 1));
            score[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(score));

        // 평균, 총합
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.printf(" 총합 : %d\n 평균 : %.2f", sum, (float) sum / score.length);
    }
}
