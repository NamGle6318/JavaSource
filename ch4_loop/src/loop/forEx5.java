package loop;

//1~100사이의 숫자 중에서
//1. 3의 배수의 총합을 구하자
//2. 3의 배수인데 그 중 9의 배수는 뺀 합을 출력
//3. 3의 배수와 5의 배수의 총합 출력

public class forEx5 {
    public static void main(String[] args) {
        int sum = 0;
        // 3의 배수의 총합
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 총합은 :" + sum);
        sum = 0;

        // 3의 배수중에서 9의 배수가 아닌 수의 총합
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수중 9의 배수를 제외한 수의 총합은 :" + sum);
        sum = 0;

        // 3의 배수와 5의 배수의 총합
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수와 5의 배수의 총합은 :" + sum);
        sum = 0;
    }
}
