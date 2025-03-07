package extend;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카드

    // 체크카드 번호
    private String cardNo;

    // 비용 지불
    // 사용한 카드번호와 체크카드 번호가 일치여부 확인
    // 잔액 > 사용액 확인
    long pay(String cardNo, int balance) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < balance) {
            throw new Exception("cardNo나 잔액을 확인해주세요."); // exception : 강제 종료
        }
        withdraw(balance);
        return getBalance();
    }

    // 아래 생성자는 default 생성자 자동 생성
    // 해당 클래스가 상속 관계를 가지고 있으면 부모 클래스의 default 생성자도 같이 생성함
    // public CheckingAccount() {
    // super(); // 부모의 default 생성자
    // }

    // public CheckingAccount(String cardNo) {
    // this.cardNo = cardNo;
    // }

    // 계좌, 계좌주, 잔액, 카드 번호를 입력받는 생성자
    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    public String getCardNo() {

        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
