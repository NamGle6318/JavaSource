package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account[] account = new Account[100]; // static 저장공간에 클래스(Account) 타입의 변수 저장
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        int menu;
        while (run) {
            System.out.println("=========================================================");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("=========================================================");

            System.out.print("선택 >>>");
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    createAccount(); // account 인스턴스 생성한 걸 집어 넣기
                    break;
                case 2:
                    accountList(); //
                    break;
                case 3:
                    deposit();

                    break;
                case 4:
                    withdraw();

                    break;
                case 5:
                    System.out.println("종료");
                    run = false;
                    break;
                default:
                    System.out.println("번호 확인");
                    break;
            }
            System.out.println("=================");
        }
        sc.close();
    }

    // 내부에서만 사용하기위해 private
    // 계좌 개설
    private static void createAccount() {
        // 필요 정보 입력
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 :");
        long balance = Integer.parseInt(sc.nextLine());
        // account 배열 빈공간에 새로운 account 저장 후 반복문 종료
        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌의 정보 목록
    private static void accountList() {
        System.out.println("=============계좌 목록===========");
        for (Account account2 : account) {
            if (account2 == null)
                break;
            System.out.printf("%s\t%s\t%s\n", account2.getAno(), account2.getOwner(), account2.getBalance());
        }
        System.out.println("=================================");

    }

    // 예금
    private static void deposit() {
        // 예금
        String ano = " ";
        do {
            // 예금액 입력 받기
            System.out.println(" 계좌번호를 입력하세요.");
            ano = sc.nextLine();
        } while (findAccount(ano) == null); // 입력받은 계좌가 null 값일경우 계좌번호 재입력
        // 예금액 입력 받은 후 적용
        Account findAcc = findAccount(ano);
        System.out.println("예금하실 금액을 입력하세요.");
        int balance = Integer.parseInt(sc.nextLine());
        findAcc.deposit(balance);
        return;
    }

    // 출금
    private static void withdraw() {
        // 출금
        String ano = " ";
        do {
            // 출금액 입력 받기
            System.out.println(" 계좌번호를 입력하세요.");
            ano = sc.nextLine();
        } while (findAccount(ano) == null); // 입력받은 계좌가 null 값일경우 계좌번호 재입력
        // 출금액 입력 받은 후 적용
        Account findAcc = findAccount(ano);
        System.out.println("출금하실 금액을 입력하세요.");
        int balance = Integer.parseInt(sc.nextLine());
        findAcc.withdraw(balance);
        return;
    }

    private static Account findAccount(String ano) {
        // 입력받는건 계좌번호 리턴은 해당 계좌번호의 값을 가진 인스턴스
        // 1 ~ 100까지 입력한 계좌번호와 일치하는걸 찾기
        // 찾으면 return 몇번값인지
        // 만약 null이 나오면 일치하는게 없음

        for (int i = 0; account[i] != null; i++) {
            if (ano.equals(account[i].getAno()))
                return account[i];
        }
        System.out.println("일치하는 계좌가 존재하지 않습니다.");
        return null;
    }
}
// nullpointexception = null 값을 가진 대상을 호출할 경우