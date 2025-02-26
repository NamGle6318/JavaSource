package condition;

import java.util.Scanner;

//조건식 if else문 다중 사용

//score 값을 입력을 받음

//score 값이 90 이상 : 참 = 등급은 A입니다.
//score 값이 80 이상 : 참 = 등급은 B입니다. 
//score 값이 70 이상 : 참 = 등급은 C입니다. 
//score 값이 60 이상 : 참 = 등급은 D입니다. 
//score 값이 60 미만 : 참 = 등급은 F입니다.

public class ifTest4 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("score값을 입력하세요.");
        
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if(score >= 90) {
            System.out.println("등급은 A입니다");

        } else if(score >= 80) {
            System.out.println("등급은 B입니다.");

        } else if(score >= 70) {
            System.out.println("등급은 C입니다.");

        } else if(score >= 60) {
            System.out.println("등급은 D입니다.");

        } else {
            System.out.println("등급은 F입니다.");

        }
        scanner.close();
    }    
}
