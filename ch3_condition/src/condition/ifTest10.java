package condition;

import java.util.Scanner;

// 세개의 숫자를 입력받은 후 가장 큰 수를 출력하는 프로그램

// 1. 숫자 세개를 입력받을 변수 3개 만들기
// 2. 숫자를 하나씩 비교한다. 1번수 2번수 비교하여 더 큰수가 3번수랑 비교
// 가장작은수도 출력
public class ifTest10 {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수 입력.");
        String input = sc.nextLine();
        num1 = Integer.parseInt(input);

        System.out.println("두 번째 수 입력.");
        input = sc.nextLine();
        num2 = Integer.parseInt(input);

        System.out.println("첫 번째 수 입력.");
        input = sc.nextLine();
        num3 = Integer.parseInt(input);

        int min = num1;
        
        if (min > num2){
            min = num2;
            
        }
        if (min > num3){
            min = num3;

        }

        int max = num1;

        if (max < num2){
            max = num2;

        }
        if (max < num3){
            max = num3;

        }

       
        System.out.printf("가장 큰 수 : %d\n가장 작은 수 : %d\n", max, min);
    }
}


