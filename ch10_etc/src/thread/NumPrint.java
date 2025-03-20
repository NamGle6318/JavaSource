package thread;

public class NumPrint implements Runnable{

    @Override
    // 1~100까지 출력
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "  ");
        }
    }
    
}
