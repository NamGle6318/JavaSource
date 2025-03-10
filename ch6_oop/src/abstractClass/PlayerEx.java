package abstractClass;

public class PlayerEx {
    public static void main(String[] args) {
        Player player = new CDPlayer(); // 추상화 클래스의 인스턴스 직접 생성 불가능 = 다형성 인스턴스 강제
        player.play();
        Player audioPlayer = new AudioPlayer();
        audioPlayer.play();
    }
}
