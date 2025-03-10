package poly;

// 다형성(polymorphism)
// 상속과 관련이 있음
// 여러가지 형태를 가질 수 있는 능력
// 한 타입의 참조변수로 여러 타입의 객체를 참조한다.
// 상위 타입의 참조변수로 하위 클래스의 인스턴스를 참조한다.

public class Animal {
    // Animal과 상속관계 (Canine, Feline)
    // Canine과 상속관계 (Cat, Dog)

    // 생성자
    public Animal() {
        System.out.println("Animal 생성자");
    }
}

class Canine extends Animal {
    Canine() {
        System.out.println("Canine 생성자");
    }
}

class Feline extends Animal {
    Feline() {
        System.out.println("Feline 생성자");
    }
}

class Dog extends Canine {
    Dog() {
        System.out.println("Dog 생성자");
    }
}

class Cat extends Canine {
    Cat() {
        System.out.println("Cat 생성자");
    }
}
