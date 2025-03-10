package poly;

// NPE : 참조형 변수는 주소를 나타내는데 그 참조형 변수의 값이 null이면 참조형 변수를 호출할경우 주소가 없어서 접근이 불가능 -> NPE

public class CarEx3 {
    public static void main(String[] args) {
        Tire frontLeft = new KumhoTire(1, "앞 왼쪽");
        Tire frontRight = new HankookTire(1, "앞 오른쪽");
        Tire backLeft = new HankookTire(1, "뒤 왼쪽");
        Tire backRight = new KumhoTire(1, "뒤 오른쪽");

        Car3 car3 = new Car3(frontLeft, frontRight, backLeft, backRight); // 생성자를 통한 NPE 방지
        // System.out.println(car3.backLeft); // car3의 backLeft 값을 출력 null
        System.out.println(car3.backLeft.accumulateRotation); // NPE 발생

    }
}
