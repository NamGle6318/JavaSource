package loop;

import java.util.Scanner;

//문자 입력받은 후 출력
//Q라는 문자를 입력 시 프로그램 종료

//[참고] (input.equals("Q")) : input 의 문자열과 "Q"가 맞는지를 비교
//       input.equalsIgnoreCase("q") : 위와 동일한대신 대소문자를 무시하고 비교

//for문은 조건식이 통과하면 계속 반복문을 실행하는 느낌이지만
//while 문은 조건식이 통과하지 않아야 반복문을 멈추는 느낌

public class doWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.print("문자 입력 :");
            input = scanner.nextLine();
            System.out.print("입력한 문자 : " + input + "\n");
        } while (!input.equals("Q"));
        System.out.println(" 프로그램을 종료합니다.");
        scanner.close();
    }
}
