package condition;

import java.util.Scanner;

// 윤년, 평년 구하기
// 년도 입력받기
// 입력받은 년도가 윤년인지 평년인지 출력
// 윤년 : 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아님 
//      : 년도를 400으로 나눈 나머지가 0 
//식 : 년도 % 4 == 0 && 년도 % 100 != 0 or 년도 % 400 == 0


public class ifTest9 {
    public static void main(String[] args) {
        
        int year = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요.");
        String input = sc.nextLine();
        
        year = Integer.parseInt(input);
        
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("입력하신 년도는 윤년입니다.");
        } else{
            System.out.println("입력하신 년도는 평년입니다.");
        }

    }
}

