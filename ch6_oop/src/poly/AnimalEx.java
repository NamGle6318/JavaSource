package poly;

// 다형성(polymorphism)
// 상속과 관련이 있음
// 여러가지 형태를 가질 수 있는 능력
// 한 타입의 참조변수로 여러 타입의 객체를 참조한다.
// 조상 타입의 참조변수로 자손 클래스의 인스턴스를 참조한다.
// 참조 변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        // Animal animal = new Animal();
        // Canine celine = new Canine();
        // Feline feline = new Feline();
        // Cat cat = new Cat();
        // Dog dog = new Dog();

        // 다형성을 띈 인스턴스 생성 (부모 = new 자식)
        // 해당 클래스의 부모 클래스도 참조하게 된다.
        Animal animal0 = new Animal();
        Animal animal1 = new Canine();
        Animal animal2 = new Feline();
        Animal animal3 = new Cat();
        Animal animal4 = new Dog();
    }
}
