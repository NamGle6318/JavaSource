package op;

import java.util.Scanner;

//사용자로부터 문자를 입력 받은 후 그 문자가 숫자인지 영문자인지 판별하는 프로그램
//1. 문자 입력 받기
//2. 입력받은 문자가 숫자인지 영문자 인지 판별
//3. 결과 출력

public class LogicalEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력하시오.");
        
        String input = scanner.nextLine();
        char ch = input.charAt(0);

        if ('0' <= ch && ch <='9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        }

        if (('a' <= ch && ch <='z') || ('A' <= ch && ch <='Z')) {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

        scanner.close();

    }
}



//char ch = input.charAt(0); = input 변수 안에 들어있는 문자열의 0번째를 ch에 담기