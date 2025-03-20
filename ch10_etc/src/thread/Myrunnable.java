package thread;

class Myrunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "실행 중....");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
