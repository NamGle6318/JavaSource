package inter;

// 인터페이스 클래스는 클래스들간의 의존성을 약화 시키는 기능을 한다. 

interface I {
    abstract void methodB(); // abstract 생략 가능
}

class AA {
    public void methodA(I i) { // 클래스 B는 인터페이스 I를 참조 (I안에 B가 있는 느낌)
        i.methodB(); // i 안에있는 B를 부른다 (다형성 개념으로 사용 가능)
    }
}

class BB implements I {

    @Override
    public void methodB() {
        System.out.println("method B");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();

        // obj1.methodA(new I()); // interface 클래스는 인스턴스 생성 불가능
        obj1.methodA(new BB());
        // 의존관계 A -> B의존

    }
}
