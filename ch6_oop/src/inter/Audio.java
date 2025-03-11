package inter;

public class Audio implements RemoteControl {
    private int volume; // Audio의 현재 볼륨

    @Override // Audio 전원 키기
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override // Audio 전원 끄기
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
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
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}
