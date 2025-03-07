package extend;

public class DrawShapeEx {
    public static void main(String[] args) {

        // 삼각형 만들기
        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100) };
        // p[0] = new Point(100, 100);
        // p[1] = new Point(140, 50);
        // p[2] = new Point(200, 100);

        Triangle triangle = new Triangle(p);
        triangle.draw();

        // Point p1 = new Point(150, 150);
        // Circle c = new Circle(p1, 50);

        // 원 만들기
        Circle c = new Circle(new Point(150, 150), 50);
        c.draw();
    }
}
// 사용된 클래스 : Circle, shape, Point, Triangle

// 관계
// Circle, Triangle isa shape
// Circle, Triangle hasa Point