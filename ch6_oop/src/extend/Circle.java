package extend;

// 상속관계 = isa 관계
// 포함관계 = hasa 관계 
// ? 그동안 만들었던 예제들은 무슨관계였나

// 이 중 포함관계 : 한 클래스 안에 다른 클래스가 멤버 변수로 선언된 상황

// 관계 결정하기
// isa 관계로 Circle과 Point를 작성하면?
// Circle is a Point

//hasa 관계로 작성하면?
// Circle has a Point

// 해석의 차이

public class Circle extends Shape {
    // int x;
    // int y;

    // String name = new String("abc"); (인스턴스 생성)
    Point point; // (포함관계)

    int r;

    public Circle() {

    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }
    // 오버 라이딩 : 부모 클래스에 있던 메소드를 자식 클래스에서
    // 내용만 다르게 같은이름으로 사용

    void draw() {
        System.out.printf("center= (%d, %d), r = %d, color = %s\n",
                point.x, point.y, r, color);
    }
}
