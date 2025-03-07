package extend;

public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;
    }

    // 오버라이딩
    // (잔액 + 마이너스 한도) - 사용액

    @Override
    void withdraw(long balance) throws Exception {
        if (super.getBalance() + this.creditLine < balance) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        super.setBalance(super.getBalance() - balance);
        System.out.println("현재 잔액 : " + getBalance());
    }

}
