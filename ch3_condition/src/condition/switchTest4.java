package condition;

import java.util.Scanner;

//가위, 바위, 보 프로그램
    //가위(1) 바위(2) 보(3)
//컴퓨터의 가위, 바위, 보를 결정 - 무작위
// 2(바위) - 1(가위) = 1 (컴퓨터)[공식]
//컴퓨터 승, 유저 승, 비김

//유저를 기준으로 하고
//[공식]대로 했을때 유저가 이겼을 때 나오는 수 : -2, 1 (1번 가위 vs 보 = -2)(2번 바위 vs 가위 = 1) 
//유저가 졌을 때 나오는 수 : -1, 2 (1번 가위 vs 바위 = -1)(2번 보 vs 가위 = 2)
//나머지 = 유저가 비겼을 때 나오는 수
//switch case를 -2, 1 = 이겼다는 문구
// -1, 2 = 졌다는 문구
//나머지 = 비겼다는 문구

public class switchTest4 {
    public static void main(String[] args) {
        int computer = (int) ((Math.random() * 3) + 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중 하나를 입력하시오.");
        String input = sc.nextLine();

        int user = Integer.parseInt(input);

        switch (user - computer){
            case 2: 
            case -1:
                System.out.println("컴퓨터가 이겼습니다.");
                break;
            case 1:
            case -2:
                System.out.println("유저가 이겼습니다.");
                break;
            default:
                System.out.println("비겼습니다.");
                break;

        }   

        }

    }

