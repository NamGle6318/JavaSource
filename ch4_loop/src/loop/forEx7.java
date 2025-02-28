package loop;

// 중첩 for문

// ********
// ********
// ********
// ********
// ******** 출력

// 2중 for문 : 행과 열을 갖고 있을때 사용

public class forEx7 {
    public static void main(String[] args) {

        // // 별 10개씩 5줄 출력
        // for (int j = 0; j < 5; j++) {
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 0 1 2
        // 0 1 2 출력
        int score;

        for (int i = 0; i < 2; i++) {
            for (score = 0; score < 3; ++score) {
                System.out.printf("%d   ", score);
            }
            System.out.println();
        }
    }
}
