package poly;

public class CarEx2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2(); // 타이어 장착한 자동차 호출

        for (int i = 0; i < 15; i++) {
            int problemLocation = car2.run();
            car2.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 교체"); // 한국
                    car2.frontLeft = new HankookTire(15, "앞 왼쪽");
                    break;
                case 2:
                    System.out.println("앞 오른쪽 교체"); // 한국
                    car2.frontRight = new KumhoTire(13, "앞 오른쪽");
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 교체"); // 금호
                    car2.backLeft = new HankookTire(5, "뒤 왼쪽");
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 교체"); // 금호
                    car2.backRight = new KumhoTire(12, "뒤 오른쪽");
                    break;
                default:
                    break;
            }
        }

    }
}
