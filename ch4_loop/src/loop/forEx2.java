package loop;

// 반복문 : 반복적으로 실행해야하는 코드를 간단하게 처리
// for, while, do-while 중 for를 사용할 예정

//for 문을 이용하여 1~10 사이의 수 중에서 짝수만 출력

public class forEx2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }
        }
        System.out.println("\n");

        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "   ");
        }


        //for 문 안에 조건식을 공백으로 채워도 됨. (무한루프 주의)
        // int i = 0;
        // for (; ;) {
        //     System.out.println("test");
        //     break;
        // }
    }
}
