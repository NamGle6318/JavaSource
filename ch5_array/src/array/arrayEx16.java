package array;

import java.util.Scanner;

// if문 사용시 words[0][1].equals(사용자입력값)
//
public class arrayEx16 {
    public static void main(String[] args) {
        // 영단어 퀴즈를 내는 프로그램
        /*
         * 출력: Q1. chair 의 뜻은?
         * 입력: 의자
         * 정답입니다.
         * Q2. computer의 뜻은?
         * 입력: 의자
         * 틀렸습니다. 정답은 의자입니다.
         */
        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" },
        };

        Scanner scanner = new Scanner(System.in);
        String input = new String();

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?\n", i + 1, words[i][0]);
            input = scanner.nextLine();

            if (input.equals(words[i][1]))
                System.out.println("정답입니다.");
            else
                System.out.printf("틀렸습니다 정답은 \"%s\"입니다.\n", words[i][1]);
        }
        scanner.close();
    }
}
