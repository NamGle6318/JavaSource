package poly;

// 상속관계가 아닌 클래스의 기능 하나를 상속관계인 클래스들에게 복수 사용해야할 경우

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // // buyer가 Tv를 사는 기능 (1개)
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        buyer.summary();

        // 복수 buy() = 클래스 배열 사용
        // 상속관계가 없을 시 : 배열에 관련된 코드를 하나하나 다 작성해줘야함
        // 상속관계가 있을 시 : 매개변수 다형성

        // System.out.println("남은잔액은 " + buyer.money + " 입니다.");
        // System.out.println("보유하신 bonusPoint는 " + buyer.bonusPoint + " 입니다");
    }
}
