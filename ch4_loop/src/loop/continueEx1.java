package loop;

// 1~10중에 3의 배수를 제외한 값만 출력하는 프로그램

// continue : 반복문에서만 사용
//            반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감 (jump)
//            continue를 실행하면 이번반복은 스킵하고 다음 반복문 진행 

public class continueEx1 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // if (i % 3 == 0)
        // continue;

        // System.out.println(i);
        // }

        // 1~10중 짝수만 출력하는 프로그램 (continue 사용)

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }

    }
}
