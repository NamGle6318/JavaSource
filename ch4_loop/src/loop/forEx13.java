package loop;

// 1에서 100사이의 소수 구하기
//소수 : 나눌수있는 정수가 1과 본인밖에 없을때

// 소수는 자신을 나눌 수 있는 정수가 2개밖에 없는 친구
//count가 2인 친구만 소수로 판단후 출력

//일단은 1부터 100까지 증가하는 수가 x라 할때 1~x까지 x를 나눠주는 식을 쓰자
//진행하면서 나눠지는데 나누어 떨어지는 count가 2회일 경우 출력을 하자

public class forEx13 {
    public static void main(String[] args) {
        int count;
        for (int x = 2; x <= 100; x++) {
            count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(x + " ");
            }
            // System.out.print((count == 2) ? x + "" : " ");
        }
    }
}
