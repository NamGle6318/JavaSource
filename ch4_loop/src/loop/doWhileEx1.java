package loop;

import java.util.Scanner;

//컴퓨터가 1~100사이의 임의의 정수 생성
//사용자에게 1~100사이의 정수를 입력 받음
//입력받은 값과 컴퓨터가 생성한 값 비교해 사용자의 수가 컴퓨터의 숫자와 대소비교를 한 후 정답 출력
//오답을 입력시 정답을 입력할때까지 재입력

//[참고] (int)(Math.random() * 100 + 1); : 1 ~ 100 사이의 랜덤 난수 생성
//       input = scanner.nextInt(); : 입력받은 수를 int형으로 알아먹겠다. 입력받은 값이 다른 값이면 오류

public class doWhileEx1 {
    public static void main(String[] args) {

        int computer = 0;
        computer = (int) (Math.random() * 100 + 1);

        int input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 ~ 100 사이의 수를 입력하세요.");
        input = scanner.nextInt();
        int score = 0;
        do {
            if (input < computer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (input > computer) {
                System.out.println("더 작은 수를 입력하세요.");
            }
            input = scanner.nextInt();
            score++;
        } while (input != computer);

        System.out.println("정답입니다. 프로그램을 종료합니다.");
        System.out.println("정답을 시도한 횟수 : " + score);
        scanner.close();
    }
}
