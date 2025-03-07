package extend;

import java.util.Scanner; // 패키지 외부에서 데려오기 (패키지명).(클래스명) = 클래스 풀네임

// += 에는 자동 형변환을 지원해주나보다
public class AccountEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // CheckingAccount 인스턴스를 생성과 동시에 해당 클래스의 부모 클래스인 Account의
        // 인스턴스도 생성됐다.
        // 체크카드 계좌
        CheckingAccount cAccount = new CheckingAccount("1577-1577", "앞뒤가 같은", 100000, "123-123");

        try {
            System.out.println("현재잔액 : " + cAccount.pay("123-123", 100000));

        } catch (Exception e) { // exception 쓸때 같이 있어야 되나봄
            e.printStackTrace();
        }

        // 마이너스 계좌
        CreditLineAccount cla = new CreditLineAccount("10123", "마이너", 500000, 1000000);

        try {
            cla.withdraw(1350000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 보너스 계좌
        BonusPointAccount bonusPointAccount = new BonusPointAccount("0858", "시식", 1000, 0);

        bonusPointAccount.deposit(10000);
        System.out.println("보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        // 교통카드 계좌
        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("8282", "지하철", 100000, "5252",
                false);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("8282", "지하철", 100000, "5252",
                true);
        try {
            checkingTrafficAccount.payTrafficCard("5252", 100000);
            System.out.println(" 잔액" + checkingTrafficAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            checkingTrafficAccount2.payTrafficCard("5252", 100000);
            System.out.println(" 잔액" + checkingTrafficAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
