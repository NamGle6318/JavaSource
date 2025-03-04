package array;

import java.util.Arrays;

public class arrayEx14 {
    public static void main(String[] args) {
        // 학생 5명의 과목 점수 (국어, 영어, 수학) 입력 프로그램
        int sum = 0; // 학생별 총점
        float avg = 0; // 학생별 평균
        int korTotal = 0, engTotal = 0, mathTotal = 0; // 학생들의 과목별 총점

        int[][] score = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };

        // 학생 5명의 각 과목점수와 총점과 평균을 출력
        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("============================================");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d\t", i + 1); // 학생 인원수대로 각 열의 첫번째 행에 번호 출력(1~5)
            sum = 0;
            avg = 0;
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) { // 개인별 점수 출력
                sum += score[i][j];
                System.out.printf("%d\t", score[i][j]);
            }

            // 학생 점수를 다 출력한 후에, 총점과 평균을 출력
            avg = sum / (float) (score[i].length);
            System.out.printf("%d\t %.2f\n", sum, avg);
        }
        System.out.println("============================================");

        System.out.printf("총점\t%d\t%d\t%d", korTotal, engTotal, mathTotal);
    }
}
// 전부 1t인데 위치가 같음???
// 100 .
// 98 .
// 1 .