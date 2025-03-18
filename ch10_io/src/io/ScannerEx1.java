package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력 : | 1. inputStream | 2. Scanner |
        // Scanner
        // nextLine() : 엔터까지 읽음
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력1");
        int num1 = sc.nextInt(); // 5 \n
        System.out.println("연산자 입력(+, =, /, *)");
        // String str = sc.nextLine(); // nextInt에서 남은 \n 값을 받음
        String str2 = sc.nextLine(); // + \n
        System.out.println("숫자입력2");
        int num2 = sc.nextInt(); // java.util.InputMismatchException

        System.out.printf("%d %s %d = %d", num1, str2, num2, (num1 + num2));

    }
}
