package thread;

public class SmallLetters2 extends Thread {

    @Override
    // 소문자 a~z까지 출력
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "  ");
        }
        System.out.println();
    }

}
