package loop;

import java.util.Scanner;

// 입력받은 숫자의 팩토리얼을 구하기
// ex: 입력 : 4 * 3 * 2 * 1 
// 단 for문을 사용해서 곱셈을 하기

public class forEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수를 입력하시오.");
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);

        int sum = 1;

        for (int i = number; i > 0; i--) {
            sum *= i;
        }
        System.out.printf("입력하신 숫자의 팩토리얼 값은 %d 입니다.", sum);
    }
    
}
