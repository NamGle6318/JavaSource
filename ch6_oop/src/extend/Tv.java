package extend;

public class Tv {

    int channel = 0;
    boolean power = false;

    // 전원 켜기&끄기, 채널 변경, 볼륨 변경, [동작]
    // 메소드
    void channelUp() {
        channel++;
    };

    void channelDown() {
        channel--;
    };

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
