package oop;

public class TriangleEx {
    public static void main(String[] args) {

        // 1. 일일이 인스턴스 설정하기
        Triangle triangle = new Triangle();

        triangle.baseLine = 7;
        triangle.height = 10;

        System.out.println(triangle.getArea());

        // 2. 생성자 양식 만들어서 생성하기
        Triangle triangle2 = new Triangle(8, 4);

        System.out.println(triangle2.getArea());

        int result;
        Triangle triangleEx = new Triangle(3, 5);
    }
}
// 생성자 목적
// 인스턴스 변수 초기화
