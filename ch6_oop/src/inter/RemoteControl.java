package inter;

// 인터페이스 예시

public interface RemoteControl {
    // 상수, 추상 메서드, (default, static) 메서드

    // 상수 : public final static (생략 가능)
    final static int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메서드 : public abstract (생략 가능)
    abstract void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute)
            System.out.println("mute on");
        else
            System.out.println("mute off");

    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
