package extend;

public class BonusPointAccount extends Account {
    // 예금을 할때마다 0.01씩 보너스를 줌

    private int bonusPoint;

    public BonusPointAccount(String ano, String owner, long balance, int bonusPoint) {
        super(ano, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
    // 예금할때 예금액의 1퍼센트를 추가하는 기능

    @Override
    void deposit(long balance) {
        super.deposit(balance);
        this.bonusPoint += (long) (balance / 100);
        // this.bonusPoint = (this.bonusPoint + (balance * 0.01));
    }
}
