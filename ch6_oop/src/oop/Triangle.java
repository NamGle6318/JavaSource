package oop;

public class Triangle {
    // 속성 : 밑변(baseLine), 높이(height) |(int)
    // 기능 : 삼각형의 면적을 구한다.|(double)[getArea]

    int baseLine, height;

    int getArea() {
        return (baseLine * height) / 2;
    }

    // 생성자
    public Triangle() {

    }

    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }
}
// public : 생성자 / static : 클래스변수? /