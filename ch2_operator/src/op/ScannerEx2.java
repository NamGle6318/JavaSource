package op;

import java.util.Scanner;

// Scanner 클래스의 nextInt 사용

// int input = scanner.nextInt(); : Scanner로 입력받을때 정수형태인 숫자로 입력받겠다.(nextInt())

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 >> ");

        int input = scanner.nextInt();
        System.out.println(input);

        scanner.close();
    }

}
