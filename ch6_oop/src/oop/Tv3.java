package oop;

// private : 외부 클래스에서 접근 불가능 : 멤버변수
// public : private의 반대, 오픈하는 것 : 생성자, 메서드

public class Tv3 {
    private int size = 0;
    private String color = "NULL";
    private int volume = 0;
    private int channel = 0;
    private boolean power = false;

    // setter, getter
    // setter : 멤버 변수의 값 설정
    // getter : 멤버변수 값 불러오기

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public Tv3() {

    }

    @Override
    public String toString() {
        return "Tv2 [size=" + size + ", color=" + color + ", volume=" + volume + ", channel=" + channel + ", power="
                + power + "]";
    }

}
