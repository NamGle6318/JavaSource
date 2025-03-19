package thread;

public class BigLetters {
    public static void main(String[] args) {
        // BigLetters : 대문자 출력 / SmallLetters : 소문자 출력 을 동시에 진행
        SmallLetters sm = new SmallLetters();
        sm.run();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}
