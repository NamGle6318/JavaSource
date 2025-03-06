package oop;

// private : 외부 클래스에서 접근 불가능

public class Tv2 {
    private int size = 0;
    private String color = "NULL";
    private int volume = 0;
    private int channel = 0;
    private boolean power = false;

    // 전원 켜기&끄기, 채널 변경, 볼륨 변경, [동작]
    // 메소드
    void channelUp(int channel) {
        this.channel = channel;
    };

    void channelDown(int channel) {
        this.channel = channel;
    };

    void power() {
        power = !power;
    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Tv2() {

    }

    @Override
    public String toString() {
        return "Tv2 [size=" + size + ", color=" + color + ", volume=" + volume + ", channel=" + channel + ", power="
                + power + "]";
    }

}
