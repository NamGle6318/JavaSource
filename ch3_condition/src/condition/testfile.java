package condition;

import java.util.Scanner;
//첫번째 문자열을 입력 받음 (단 한자리수만 적용)
//입력받은 문자열이 숫자인지 확인
//입력받은 문자열이 숫자가 아닐경우 다시 입력 받음
//입력받은 문자열이 숫자일 경우 다음 문자를 입력함
public class testfile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요.");
        String input = sc.nextLine();
        char ch = input.charAt(0);
        int num = ' ';
        int result = 0;
        // int num = Integer.parseInt(input);
        // char ch = input.charAt(0);

        if (!( ch >= '0' && ch <= '9')){
            System.out.println("수를 옳바르게 입력하지 않았으므로 종료합니다.");
            sc.close();
        }
        int sum = (int)ch;
        System.out.println(ch);
        result = sum;

        //

        System.out.println("두번째 수를 입력하세요.");
        input = sc.nextLine();
        ch = input.charAt(0);
        
        if (!( ch >= '0' && ch <= '9')){
            System.out.println("수를 옳바르게 입력하지 않았으므로 종료합니다.");
            sc.close();
        }
        sum = (int)ch;
        System.out.println(ch);
        result = sum;

        System.out.println("두 수의 합 : " + result);
        
        sc.close();
    }
}
