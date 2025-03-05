package oop;

public class CardEx1 {
    public static void main(String[] args) {
        System.out.println("카드 너비 : " + Card.width + "카드 높이 : " + Card.height);

        // 클래스 변수 : Static으로 선언한 것은 클래스이름.으로 접근
        // 메서드로 접근해도되나 경고 밑줄이 쳐짐

        // Card.number = 0 ;
        Card card = new Card();
        card.number = 5;
        card.kind = "heart";

        Card card2 = new Card();
        card.number = 6;
        card.kind = "clover";

        Card card3 = new Card();
        card.number = 7;
        card.kind = "spade";

        Card card4 = new Card();
        card.number = 8;
        card.kind = "diamond";

        System.out.println(card.kind + " " + card.number);

    }
}
