package poly;

public class KumhoTire extends Tire {

    public KumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotation;

        if (accumulateRotation < maxRotation) { // 타이어의 누적회전수가 최대 회전수를 초과 = 펑크
            System.out.println(location + " KumhoTier 수명 : " + (maxRotation - accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + "KumhoTier 펑크 ***");
            return false;
        }
    }
}
