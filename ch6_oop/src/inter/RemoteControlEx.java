package inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(-19);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        RemoteControl.changeBattery();

        // 익명 구현 클래스 : 잠깐 쓰고 버릴거
        // 라디오를 킨다, 끈다
        rc = new RemoteControl() { // 지역 클래스의 느낌
            int volume;

            @Override
            public void turnOn() {
                System.out.println("Radio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Radio를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Radio 볼륨 : " + this.volume);
            }

        };
        rc.turnOn();
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
    }
}
