package oop;

import java.util.Scanner;

public class CalcEx {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // 더하기 빼기 곱하기 나누기
        long add;
        long subtract;
        long multiply;
        long result;
        double divide;

        // 자동 형변환 != casting
        int num1 = 45;
        int num2 = 15;
        result = calc.add(num1, num2);

        // System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
        // System.out.printf("%d - %d = %d\n", num1, num2, calc.subtract(num1, num2));
        // System.out.printf("%d * %d = %d\n", num1, num2, calc.multiply(num1, num2));
        // System.out.printf("%d / %d = %.2f\n", num1, num2, calc.divide(num1, num2));

        // long 타입의 정수 2개를 입력으로 받기
        // 입력 값 2개중 더 큰수를 출력

        Scanner scanner = new Scanner(System.in);
        long number1, number2;

        do {

            System.out.print("정수 2개 입력");
            System.out.println();
            number1 = scanner.nextLong();
            number2 = scanner.nextLong();

        } while (number1 == number2); // 같은 수를 입력할 시 재입력

        result = calc.max(number1, number2);
        System.out.println("더 큰 수 : " + result);
        result = calc.min(number1, number2);
        System.out.println("더 작은 수 : " + result);

    }
}
