package thread;

public class UserEx {
    public static void main(String[] args) {
        //user1, user2 동시 실행
        Calc calc = new Calc();
        Thread thread1 = new User1(calc);
        Thread thread2 = new User2(calc);

        thread1.start();
        thread2.start();
    }
}
