package oop;

import java.util.Scanner;

public class AccountEx2 {

    private static Account account; // static 저장공간에 클래스(Account) 타입의 변수 저장
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Account account = new Account();
        // 해당 프로그램의 목적은 추후 여러개의 계좌의 정보를 저장하는 역할을 수행
        // 프로그램 구조상 위 코드를 작성하게 되면 여러개의 인스턴스를 생성하는것이 아닌
        // 동일한 인스턴스에 새로운 인스턴스를 덧씌우는 꼴이지만,
        // 인스턴스들을 저장하는 배열을 만들고 저장하는 위치만 다르면 상관이 없지 않을까?

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
                    account = createAccount(); // account 인스턴스 생성한 걸 집어 넣기
                    break;
                case 2:
                    accountList(account); //
                    break;
                case 3:
                    deposit(account);
                    System.out.println("현재 잔고 : " + account.getBalance());
                    break;
                case 4:
                    withdraw(account);
                    System.out.println("현재 잔고 : " + account.getBalance());
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
    private static Account createAccount() {
        // 필요 정보 입력
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 :");
        long balance = Integer.parseInt(sc.nextLine());

        // account 인스턴스 생성
        return new Account(ano, owner, balance);
    }

    // 계좌의 정보 목록
    private static void accountList(Account account) {
        System.out.println("=================================");
        System.out.println("계좌 목록");
        System.out.println("=================================");
        System.out.printf("%s\t%s\t%s\n", account.getAno(), account.getOwner(), account.getBalance());
    }

    // 예금
    private static void deposit(Account account) {
        // 예금
        // 계좌번호 입력받기 => 입력한 계좌번호와 account의 계좌번호 일치 여부 확인
        // 예금액 일벽받기 => 잔액 = 잔액 + 예금액
        System.out.println(" 계좌번호를 입력하세요.");
        String ano = sc.nextLine();
        if (!(ano.equals(account.getAno())))
            return;

        System.out.println("예금하실 금액을 입력하세요.");
        long balance = 0;
        balance = Integer.parseInt(sc.nextLine());
        account.deposit(balance);

    }

    // 출금
    private static void withdraw(Account account) {
        System.out.println(" 계좌번호를 입력하세요.");
        String ano = sc.nextLine();
        if (!(ano.equals(account.getAno())))
            return;

        System.out.println("출금하실 금액을 입력하세요.");
        long balance = 0;
        balance = Integer.parseInt(sc.nextLine());
        account.withdraw(balance);

    }

    // private static void findAccount() {
    // }
}