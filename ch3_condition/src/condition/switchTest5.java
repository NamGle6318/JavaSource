package condition;


import java.util.Scanner;


public class switchTest5 {
    //점수 입력을 받음(0~100), 점수에 따라 등급을 출력하는 프로그램을 작성 [switch 문 사용]
    //기준 : 
    //A = 90이상
    //B = 80이상
    //C = 70이상
    //F = 70미만
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);


        switch (score / 10){
            case 10 :
            case 9 :
                System.out.println("귀하의 등급은 A");
                break;
            case 8 : 
                System.out.println("귀하의 등급은 B");
                break;
            case 7 :
                System.out.println("귀하의 등급은 C");
                break;
            default :
                System.out.println("귀하의 등급은 F");
                break;
            }
        }
    }

