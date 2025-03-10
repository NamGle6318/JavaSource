package poly;

// 다형성(polymorphism)
// 상속과 관련이 있음
// 여러가지 형태를 가질 수 있는 능력
// 한 타입의 참조변수로 여러 타입의 객체를 참조한다.
// 상위 타입의 참조변수로 하위 클래스의 인스턴스를 참조한다.

// 부모클래스를 참조한 인스턴스가 자식클래스를 참조한다면
// 자식클래스를 사용할 수는 없지만, Override를 반영은해준다

public class ChildEx {
    public static void main(String[] args) {
        // 인스턴스 생성 방법 2개
        Child child1 = new Child(); // child 클래스의 인스턴스를 생성
        Parent parent = new Child(); // parent 클래스의 인스턴스를 생성하나 child의 Override는 반영

        // 일방적인 인스턴스 사용시
        // 범위 (자식 클래스 전역)
        // child1.method1(); // parent method1()
        // child1.method2(); // child method2() (override됨)
        // child1.method3(); // child method3()

        // 다형성을 띈 인스턴스 사용시
        // 범위 (부모 클래스 전역, 단 자식 클래스의 override는 반영 되있음.)
        parent.method1(); // parent method1()
        parent.method2(); // child method2() (override됨)

        // Q. child2가 자식클래스의 method3를 사용하고 싶다면?
        // 강제 형변환 (부모 <- 자식)
        Child child2 = (Child) parent;
        child2.method3();

        Parent parent2 = new Parent();
        // 강제 형변환 (자식 !<- 부모)
        child2 = (Child) parent2; // 부모클래스는 자식클래스로 강제 형변환으로도 불가능 (컴파일만 통과)
        child2.method3(); // cexception
    }

}
