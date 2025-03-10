package poly;

// NPE를 피하는 방법
// 1. 초기화하기 : 생성자, set메서드, 멤버변수 선언과 초기화를 동시에 진행
// 2. if문으로 null 체크

public class Car3 {
    // 멤버변수 타입 : 기본, 객체(참조, (대문자로 시작, 배열)
    // 기본 : 정수 - 0 , 실수 - 0.0 , boolean - false, char - ' '
    // 객체(참조) : null

    Tire frontLeft;
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
