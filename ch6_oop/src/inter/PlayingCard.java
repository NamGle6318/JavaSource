package inter;

// 인터페이스 선언

public interface PlayingCard {
    // 멤버변수, 일반메서드 금지

    // 상수 선언 (대문자) public static final 생략
    int SPADE = 4;

    // 추상 메서드 선언 (public, abstract 생략가능)
    abstract void play();

    // static, default가 붙는다면, 일반메서드도 허용 (1.8버전 이후부터 가능)
    static void display() {
    }

    default void print() {
    }
}
