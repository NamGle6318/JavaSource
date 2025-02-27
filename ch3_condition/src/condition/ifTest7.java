package condition;

import java.util.Scanner;

// 변수의 값을 입력받음
// 변수에 할당된 값이 홀수인지 짝수인지 판별하는 프로그램

// 변수 선언
// 변수의 값을 입력받기
// 변수를 2로 나눴을 때 나머지가 0이면 짝수, 그렇지 않으면 홀수

public class ifTest7 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력하세요");
        String input = sc.nextLine();
        
        int num1 = 0;
        num1 = Integer.parseInt(input);
        
        
        if (num1 == 0){
            System.out.println("0");

        } else if(num1 % 2 == 0){
            System.out.println("짝수");

        } else{
            System.out.println("홀수");

        }
    }
}
