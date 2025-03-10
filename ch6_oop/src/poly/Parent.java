package poly;

// 다형성(polymorphism)
// 상속과 관련이 있음
// 여러가지 형태를 가질 수 있는 능력
// 한 타입의 참조변수로 여러 타입의 객체를 참조한다.
// 상위 타입의 참조변수로 하위 클래스의 인스턴스를 참조한다.

public class Parent {
    // 멤버변수 선언
    String field1 = " ";

    // 메서드 선언
    public void method1() {
        System.out.println("parent method1()");
    }

    public void method2() {
        System.out.println("parent method2()");
    }
}

class Child extends Parent {
    // 멤버변수 선언
    String field2 = " ";

    // 메서드 선언
    @Override
    public void method2() {
        System.out.println("child method2()");
    }

    public void method3() {
        System.out.println("child method3()");
    }
}
