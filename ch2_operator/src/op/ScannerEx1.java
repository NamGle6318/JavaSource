package op;

import java.util.Scanner;

//두 자리수 키보드로 입력받고 그대로 출력하는 프로그램

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.println("두 자리 정수 입력");
        String input = scanner.nextLine();
        
        int num = Integer.parseInt(input);
        System.out.println("입력값 : " + num);
    }
}



//     Scanner scanner = new Scanner(System.in);    //입력문 사용시

//     System.out.println("두 자리 정수 입력"); 
//     String input = scanner.nextLine();   //입력한 문자열을 input 에 저장
    
//     int num = Integer.parseInt(input);  //문자열을 숫자로 변환 (입력받은 문자는 정수가 아닌 문자열이기 때문에 type을 변환)
//     System.out.println("입력값 : " + num);

//System.in : 키보드
//System.out : 모니터