package array;

// 배열 : 동일한 type의 여러 변수를 하나의 묶음으로 다루는 개념
//        한번 선언한 배열의 크기는 변경이 불가능

// 배열명의 공간 : stack / 배열 내 data들의 공간 : heap

public class arrayEx1 {
    public static void main(String[] args) {
        // 학생 5명의 점수를 입력하는 프로그램

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]); // = 0 0 0 0 0
        }
        System.out.println();

        int[] scores2 = { 85, 65, 95, 74, 100 };
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores2[i] + "  "); // = 85 65 95 74 100
        }
        System.out.println("\n" + scores2[2]); // scores2[2] = "95"
        System.out.println(scores2.length); // scores2의 배열 길이

        // 한 배열의 특정 값 수정
        scores2[4] = 98;

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores2[i] + "  "); // = 85 65 95 74 98
        }

        System.out.println(scores[5]); // Error : ArrayIndexOutOfBoundsException 범위 값을 벗어난 값
    }
}
