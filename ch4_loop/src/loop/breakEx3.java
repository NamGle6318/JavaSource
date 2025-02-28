package loop;

import java.util.Scanner;

// 통장 프로그램

public class breakEx3 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 100000; // 잔액

        while (run) {
            System.out.println("=====================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 번호 입력 >> ");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            switch (menu) {
                case 1: // 예금액을 입력 받은 후 잔액에서 추가
                    System.out.print("예금액을 입력하세요.");

                    balance += scanner.nextInt();
                    System.out.printf("잔고 : %d원\n", balance);
                    break;
                case 2: // 출금액을 입력 받은 후 잔액에서 감소
                    System.out.print("출금액을 입력하세요.");
                    balance += scanner.nextInt();
                    System.out.printf("잔고 : %d원\n", balance);
                    break;
                case 3: // 통장 잔고 출력
                    System.out.printf("잔고 : %d원\n", balance);
                    break;
                case 4: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 숫자를 입력하셨습니다.");
                    break;

            }
        }
    }
}
