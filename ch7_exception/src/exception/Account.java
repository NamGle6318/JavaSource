package exception;

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
    public static void main(String[] args) {

        Account[] accounts = new Account[5];

        // accounts 배열의 내용물이 null이 아니게 해야됨
        // or if문으로 null 체크해서 피하기
        // try catch는 if를 사용하지 않을경우 발생하게 될때 처리용
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno()); // 매개되는 참조값이 null 이면 NPE
            }

        } catch (NullPointerException e) {
            // e.printStackTrace();
            e.getMessage();
            System.out.println("입력을 확인해 주세요");
        }
        // catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}
