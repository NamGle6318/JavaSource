package loop;

public class forEx3 {
    public static void main(String[] args) {
        int sum = 0;

        // 1 ~ 10 까지의 수를 전부 합친 값을 출력하는 프로그램

        // for (int i = 1; i < 11; i++) {
        // sum += i;
        // System.out.println(sum);
        // }
        // System.out.println("1부터 10까지의 합" + sum);

        // 1~100까지의 수 중에서 3의 배수만 출력

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n1~100다 합치면 : " + sum);
    }
}