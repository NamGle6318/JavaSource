package poly;

public class Car {
    // 멤버 변수 선언
    String color;
    int door;

    // 메서드 선언
    void drive() {
        System.out.println("Drive, Brr~~~");
    }

    void stop() {
        System.out.println("Stop!!!");
    }

}

class FireEngine extends Car {
    void water() {
        System.out.println("Water!!!!!!");
    }
}
