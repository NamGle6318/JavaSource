package poly;

public class Tire {
    // 멤버 변수 선언
    int maxRotation; // 최대 회전수
    int accumulateRotation = 0; // 누적 회전수
    String location; // 타이어 위치

    // 타이어를 회전하는 메서드
    public boolean roll() {
        ++accumulateRotation;

        if (accumulateRotation < maxRotation) { // 타이어의 누적회전수가 최대 회전수를 초과 = 펑크
            System.out.println(location + " Tier 수명 : " + (maxRotation - accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + "Tire 펑크 ***");
            return false;
        }
    }

    // 생성자 선언
    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

}
