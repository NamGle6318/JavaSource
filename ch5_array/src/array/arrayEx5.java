package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayEx5 {
    public static void main(String[] args) {
        // char 값 5개 를 저장, 저장할 데이터를 이미 알고 있는 경우
        // 'a', 'b', 'c', 'd', 'e'

        char english[] = { 'a', 'b', 'c', 'd', 'e' };
        english[2] = 'f';

        System.out.println("배열의 길이 : " + english.length);

        // 배열 요소 확인
        System.out.println(Arrays.toString(english)); // 1
        System.out.println(english);

        for (int i = 0; i < english.length; i++) { // 2
            System.out.print(english[i] + "  ");
        }

        System.out.println();

        for (char c : english) { // 3
            System.out.print(c + " ");
        }
        System.out.println();

        // double type의 배열 선언
        double db[] = { 1, 3.14, 5, 7, 8 };

        System.out.println(db.length);
        System.out.println(Arrays.toString(db)); // db라는 배열의 값을 출력
        System.out.println(db); // db라는 배열명의 주소값을 출력
    }
}
