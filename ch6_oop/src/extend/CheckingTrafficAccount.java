package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    // 교통비를 지불한다.
    // 기능 :교통기능이 있을 경우 교통비 지불
    // 카드번호 일치 여부 확인 / 잔액 보유 여부 확인
    // 조건 다 통과시 잔액 - 교통비

    public long payTrafficCard(String cardNo, int balance) throws Exception {
        if (!this.hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다.");
        }
        return pay(cardNo, balance);
    }

}
