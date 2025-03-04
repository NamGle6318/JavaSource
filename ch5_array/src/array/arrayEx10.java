package array;

import java.util.Arrays;

// 45크기의 배열의 앞 6자리에 있는 숫자들을 임의로 변경하고 싶음
// 1. 0~44까지 난수 생성
// i(0~5순서) 랑 ball[0~44중 하나]랑 값을 교환
// i[0~5] 출력
public class arrayEx10 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        int temp = 0;
        int random = 0;
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) { //
            for (int j = 0; j < 44; j++) {
                random = (int) (Math.random() * 45);
                temp = ball[i];
                ball[i] = ball[random];
                ball[random] = temp;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}
