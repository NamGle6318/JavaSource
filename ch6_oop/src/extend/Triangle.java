package extend;

public class Triangle extends Shape {

    Point[] point; // triangle과 hasa 관계

    // 생성자
    public Triangle(Point[] point) {
        this.point = point;
    }

    void draw() {
        System.out.printf("p1 = %s, p2 = %s, p3 = %s, color = %s\n",
                point[0].getxy(), point[1].getxy(), point[2].getxy(), color);
    }
}
