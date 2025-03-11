package inter;

class A {
    public void methodA(B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("method B");
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) {

        // 의존관계 A -> B의존
        A obj1 = new A();
        obj1.methodA(new B());
    }
}
