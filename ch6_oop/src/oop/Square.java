package oop;

public class Square {
    // 정사각형
    // 속성 : 길이(sideLength)
    // 기능 : 면적을 구함
    int getArea() { // 변수 선언 이전에 둬도 작동? - sideLength 는 지역변수가 아닌 인스턴스 변수이기 때문에
        return sideLength * sideLength;
    }

    int sideLength = 0; // 길이 속성 선언

    // 면적을 구하는 메서드

    // 생성자
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square() {

    }

    // @Override
    // public String toString() {
    // return "Square [getArea()=" + getArea() + "]";
    // }

}
