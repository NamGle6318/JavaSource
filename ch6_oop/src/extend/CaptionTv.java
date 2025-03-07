package extend;

public class CaptionTv extends Tv { // Tv 클래스와 상속됨(하위 클래스)
    boolean caption;
    int volume;

    void displayCation(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
