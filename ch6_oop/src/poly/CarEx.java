package poly;

public class CarEx {
    public static void main(String[] args) {
        // Car 클래스 인스턴스 생성
        Car car = new FireEngine();

        car.drive();
        car.stop();

        // 강제 형변환 사용 예시
        // fCar 계속 사용가능
        // FireEngine fCar = (FireEngine) car;
        // fCar.water();

        // FireEngine을 쓸 때마다 이렇게 형변환을 해줘야함
        ((FireEngine) car).water();

        // instanceof : 참조변수가 참조하고 있는 실제 인스턴스의 타입 알아보기
        // 형변환했을때 되냐 안되냐를 확인
        // 형변환을 실패했을때 Exception이 발생하는것을 방지

        if (car instanceof FireEngine) { // car instanceof FireEngine = car 인스턴스는 FireEngine의 인스턴스를 참조
            System.out.println("FireEngine의 instance");
        }

        if (car instanceof Car) { // car instanceof Car = car 인스턴스는 Car의 인스턴스를 참조
            System.out.println("Car의 instance");
        }

        Car car2 = new Car();

        if (car2 instanceof FireEngine) {
            System.out.println("car2의 instance는 FireEngine"); // 작동하지 않음
        }

        if (car2 instanceof Car) {
            System.out.println("car2의 instance는 Car");
        }
    }
}
