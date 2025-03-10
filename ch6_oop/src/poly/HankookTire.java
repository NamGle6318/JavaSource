package poly;

public class HankookTire extends Tire {

    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotation;

        if (accumulateRotation < maxRotation) { // 타이어의 누적회전수가 최대 회전수를 초과 = 펑크
            System.out.println(location + " HankookTier 수명 : " + (maxRotation - accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + "HankookTire 펑크 ***");
            return false;
        }
    }
}
