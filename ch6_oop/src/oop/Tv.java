package oop;

//클래스의 구성 : 메인의 유무
//---
//Tv 클래스를 이용해서 Tv를 생성
// 객체 구성요소 
// 1. 속성(특성) => 멤버변수
// 2. 기능(동작) => 멤버메소드
// 멤버 = 객체(클래스) 내에서 선언하는 것들

public class Tv {
    // 크기(32, 48, 64인치), 프레임의 색상(빨강, 검정, 하양), 채널(1~100), 볼륨(1~100) 등 등 [특성]
    int size = 0;
    String color = "NULL";
    int volume = 0;
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
        return "Tv [size=" + size + ", color=" + color + ", volume=" + volume + ", channel=" + channel + ", power="
                + power + "]";
    }

}
