package thread;

public class Calc {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;

        try {
            Thread.sleep(2000); // Calc의 실행을 잠시 휴식
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }

}
