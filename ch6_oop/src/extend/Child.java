package extend;

// 상속(isa 관계)
// 기존의 클래스를 재사용하여 새로운 클래스 작성
// 적은 양의 코드로 새로운 클래스 작성 가능
// 코드를 공통적으로 관리가능 -> 코드의 추가 및 변경 용이

// 조상 클래스 : 부모, super, 상위 클래스, 기반(base) 클래스 등등으로 불림
// 자손 클래스 : 자식, sub. 하위 클래스, 파생(dervied) 클래스 등등으로 불림
public class Child extends Parent {
    void play() {
        System.out.println("Play~~~~");
    }

    public Child() {

    }

}
