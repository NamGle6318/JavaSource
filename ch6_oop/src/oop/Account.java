package oop;

public class Account {
    // 은행 계좌
    // 속성 : 계좌번호(ano)(long), 이름(owner)(String), 잔액(balance)
    // 기능 : 예금하다, 출금하다

    // 속성 선언
    String ano;
    String owner;
    long balance;

    // 예금
    long deposit(long balance) {
        return this.balance += balance;
    }

    // 출금
    long withraw(long balance) {
        return this.balance -= balance;
    }

    // 생성자(default, 멤버변수 3개다)
    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
    }

    @Override // To-do : 이거 뭔지 검색
    public String toString() {
        return "계좌번호 : " + ano + "\n" + "계좌주 : " + owner + "\n" + "잔액 : " + balance;
    }

    /////////////////////////////////////////////////

}
