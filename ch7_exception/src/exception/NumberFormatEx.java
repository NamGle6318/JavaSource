package exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        // RuntimeException - NumberFormatException
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 >>");
        try {
            int sum = Integer.parseInt(sc.nextLine()); // NFE 발생
            System.out.println(sum);
        } catch (Exception e) {
            // TODO 개발 종료 후 해당 주석 삭제
            // e.printStackTrace();
            System.out.println("입력을 확인해주세요.");
        } finally {
            System.out.print("무조건             ");
        }
        try {
            int num = 100 / 0;
        } finally {
            System.out.println(" 실행");
        }
        sc.close();

    }
}
