package condition;

import java.util.Scanner;

public class switchTest6 {
    // 연산자, 피연산자 입력 받은 후 계산하여 결과를 출력
    // 연산자는 + - * / % 중 하나 입력 받기

    // 결과 ex : 5 - 3 = 2

    // 연산자가 switch 값이 되고
    // 피연산자는 case에 따라 출력할때 계산
    public static void main(String[] args) {

        int num1, num2;
        int result = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("연산자 입력(+, -, *, /, %) ");
        String input = scan.nextLine();
        String op = input;

        System.out.println("피연산자 입력1");
        input = scan.nextLine();
        num1 = Integer.parseInt(input);

        System.out.println("피연산자 입력2");
        input = scan.nextLine();
        num2 = Integer.parseInt(input);

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("입력값을 확인해주세요.");
                System.exit(0);
        }
        System.out.printf("%d %s %d = %d", num1, op, num2, result);
    }
}
