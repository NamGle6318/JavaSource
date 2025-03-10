package abstractClass;

public abstract class Player { // 추상클래스 선언

    boolean pause;
    int currentPos;

    abstract void play(); // 추상메서드 선언

    void pause() {
    };

    // 자손 메서드에서 사용됨
    public Player() {
        pause = false;
        currentPos = 0;
    };
}

class CDPlayer extends Player {

    @Override
    void play() {
        System.out.println("CD플레이어");
    }
}

class AudioPlayer extends Player {

    @Override
    void play() {
        System.out.println("Audio플레이어");
    }
}
