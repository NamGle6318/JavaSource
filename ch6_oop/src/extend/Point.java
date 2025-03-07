package extend;

// 좌표상의 한 점을 다루기 위한 클래스
public class Point {
    int x;
    int y;

    String getxy() {
        return "(" + x + "," + y + ")";
    }

    // 생성자
    public Point() {
        // 생성자 안에서 다른 생성자를 호출하는 방법
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
