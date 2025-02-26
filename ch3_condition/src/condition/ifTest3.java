package condition;

import java.util.Scanner;

//조건식 if문 및 if else문
//if 형태 : if(조건문){조건문 결과가 true일 경우 실행}
//if else 형태 : if(조건문){조건문 결과가 true일 경우 실행} else{조건문 결과가 true가 아닐 경우 실행}

//score 값을 입력을 받음
//score값이 90 이상이면 "점수가 90점 이상입니다, 등급은 A입니다"라는 문구를 출력, score 값이 90 미만이면 "점수가 90점 미만입니다. 등급은 B입니다"를 출력
//1. score 값을 입력
//2. score가 90점 이상인지 미만인지 조건식 
//3. 90점 이상이면 if 문구 출력, 미만이면 else 문구 출력

public class ifTest3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("score값을 입력하세요.");
        
        String input = scanner.nextLine();

        int score = Integer.parseInt(input);

        if(score >= 90){
            System.out.println("점수가 90점 이상입니다, 등급은 A입니다");
        }
        else{
            System.out.println("점수가 90점 미만입니다, 등급은 B입니다");
        }
        scanner.close();
    }    
}
