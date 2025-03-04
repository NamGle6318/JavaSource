package oop;
// OOP(Object Oriented Programming) : 객체지향 프로그래밍

// 특징 : 
// 1. 재사용성이 높다.
// 2. 코드의 관리가 용이하다.
// 3. 신뢰성이 높은 프로그램을 작성할 수 있다.

// 클래스 : 객체 정의, 설계도, 틀
// 클래스 용도 : 객체 생성
// 객체 : 사물, 개념

// 예시 : 붕어빵기계(클래스) = 틀에다가 재료 넣으면 붕어모양이 나옴 

// 객체와 인스턴스
// 인스턴스 : 어떤 클래스로부터 만들어진 객체 = 붕어빵틀을 통해 만들어진 붕어빵
// 객체가 좀 더 큰 개념, 인스턴스는 특정 객체를 칭할때 하는 말 객체는 여러 인스턴스들을 통틀어 이르는 말

// Tv tv = new Tv()
// Tv tv = tv 변수명의 주소 생성
// new Tv() Tv 변수명의 주소가 Tv클래스를 가리키고 있다.
//() : 메소드 호출 = 메소드 실행
public class classEx1 {
    public static void main(String[] args) {
        // Tv 인스턴스를 생성한다
        // 클래스명 변수명 = new 클래스명();
        Tv tv = new Tv();
        Tv tv2 = new Tv();

        // 속성확인
        // System.out.println(tv);
        // System.out.println(tv2);

        // 인스턴스 사용
        // tv
        tv.color = "black";
        tv.channelUp();
        tv.color = "white";

        // tv2
        tv2.color = "black";
        tv2.power(); // on
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);
    }
}
