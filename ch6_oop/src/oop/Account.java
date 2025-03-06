package oop;

public class Account {
    // 은행 계좌
    // 속성 : 계좌번호(ano)(long), 이름(owner)(String), 잔액(balance)
    // 기능 : 예금하다, 출금하다

    // 속성 선언
    private String ano;
    private String owner;
    private long balance;

    // 예금
    void deposit(long balance) {
        this.balance += balance;
    }

    // 출금
    void withdraw(long balance) {
        if (balance > this.balance) {
            return;
        } else {
            this.balance -= balance;
        }
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
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
