package extend;

public class Account {
    // 은행 계좌

    // 속성 선언
    private String ano;
    private String owner;
    private long balance;

    // 예금
    void deposit(long balance) {
        this.balance += balance;
    }

    // 출금
    void withdraw(long balance) throws Exception {
        if (balance > this.balance) {
            throw new Exception("잔액 확인");
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

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // 생성자(default, 멤버변수 3개다)
    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // public Account() {
    // }

    @Override // To-do : 이거 뭔지 검색
    public String toString() {
        return "계좌번호 : " + ano + "\n" + "계좌주 : " + owner + "\n" + "잔액 : " + balance;
    }

    /////////////////////////////////////////////////

}
