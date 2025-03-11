package inter;

import java.rmi.Remote;

public class Television implements RemoteControl {
    private int volume; // TV의 현재 볼륨

    @Override // TV 전원 키기
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override // TV 전원 끄기
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override // 볼륨 설정
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

}
