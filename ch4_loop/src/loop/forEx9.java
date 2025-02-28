package loop;

import java.util.Scanner;

// 중첩 for문

// 사용자에게 Line값을 입력받아 입력한 수 만큼 *을 출력

// 사용자에게 정수 값을 입력받기
// 사용자에게 입력받은 값만큼 "*"을 출력, *을 출력할때마다 줄바꿈

public class forEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int line = scanner.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
