package array;

public class arrayEx15 {
    public static void main(String[] args) {
        // 가변배열 : 열의 길이가 유동적으로 처리
        int[][] score = new int[3][];
        // 행마다 다른 길이 지정
        score[0] = new int[4];
        score[1] = new int[2];
        score[2] = new int[3];

        for (int[] tmp : score) {
            for (int is2 : tmp) {
                System.out.print(is2);
            }
            System.out.println();
        }

        score[0][0] = 78;

        int[][] score2 = {
                { 78, 99, 25, 35 },
                { 12, 15 },
                { 35, 65, 75 }
        };

        // 가변배열 score2를 출력
        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2[i].length; j++) { // score2[i].length : 이 부분을 상수로 두게 되면 오류가 남
                System.out.print(score2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
