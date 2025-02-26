package condition;

import java.util.Scanner;

//중첩 if문 
//1


public class ifTest6 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.println("score값을 입력하세요.");
        
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        char grade =' ', opt=' ';
        if (score >= 90){
            grade = 'A';

            if (score >= 98){
                opt='+';

            }
            else if(score < 94){
                opt='-';

            }

        }else if (score >= 80){
            grade = 'B';

            if (score >= 88){
                opt = '+';

            }
            else if(score < 84){
                opt = '-';

            }

        } else if (score >= 70){
            grade = 'C';

            if ( score >= 78){
                opt = '+';

            }
            else if(score < 74){
                opt = '-';

            }

        } else {
            grade = 'F';
            opt = ' ';
        }
        System.out.printf("당신의 등급은 %c%c입니다.\n", grade, opt);
        scanner.close();
    }    
}

//if문 중첩사용시 형태

        // if(condition){
        //     if(condition){

        //     }else{

        //     }
        // } else{
        //     if(condition){

        //     } else{

        //     }
        // }

//사용은 가능하나, 코드가 이해하기 힘듦
