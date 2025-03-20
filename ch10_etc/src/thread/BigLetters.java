package thread;

public class BigLetters {
    public static void main(String[] args) {
        //BigLetters : 대문자 출력 / SmallLetters : 소문자 출력 을 동시에 진행
        Thread t1 = new SmallLetters2();
        t1.start();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "  ");
        }
        System.out.println();
        
        // main 스레드명
        Thread mainThread = Thread.currentThread();
        System.out.println("스레드 main name" + mainThread.getName());
        
        
    }

        // Runnable r = () -> {}
        // Thread t4 = new Thread(r) {
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // System.out.println(ch + "\t");
        // }
        // };
    }
