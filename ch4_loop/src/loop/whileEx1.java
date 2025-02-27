package loop;

// 반복문 : 반복적으로 실행해야하는 코드를 간단하게 처리
// for, while, do-while 중 while을 사용 할 예정

//무한 루프 : 반복문이 멈추지 못하는 경우

public class whileEx1 {
    public static void main(String[] args) {
        int i;
        // for (i = 0; i < 5; i++) {
        //     System.out.println("안녕");
        // }

        i = 0;
        while (i < 5) {
            System.out.println("하이");
            i++;
        }
    }
}
