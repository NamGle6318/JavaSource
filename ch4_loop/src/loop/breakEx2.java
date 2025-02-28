package loop;

// 6이 나올때까지 주사위를 굴리기
//Math.random

public class breakEx2 {
    public static void main(String[] args) {
        int dice = 0;
        int count = 0;

        while (true) {
            if (dice == 6)
                break;

            dice = (int) (Math.random() * 6) + 1;
            count++;
        }
        System.out.println("주사위 6이 나왔습니다.");
        System.out.printf("주사위를 굴린 회수 : %d.", count);
    }
}
