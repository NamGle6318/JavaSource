package condition;

import java.util.Scanner;

//임금 계산 프로그램

//**1시간 기준 임금 = 9800원

//1. 근무시간을 입력받아 hours(시간 단위) 변수에 저장
//2. *근무시간이 8시간이 초과시 초과한 시간만큼은 시간당 임금의 1.5배를 계산
    // 8시간 이전 계산식 : hours * 9800
    // 8시간 초과시 : ((hours - 8) * (9800 * 1.5)) + (9800 * 8) 1시간 초과는 rate * 1.5 * 1
//3. 계산한 결과를 pay에 저장
//4. 출력하는 문장은 " 받는 임금은 x원 입니다."로 출력

public class ifTest8 {
    public static void main(String[] args) {
        
        int rate = 9800;
        int pay = 0;
        int hours = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("오늘의 근무시간을 입력하세요(시간)");
        String input = sc.nextLine();
        
        hours = Integer.parseInt(input);

        //근무시간 8시간 이내
        if (hours <= 8){
            pay = hours * rate;

        } else {  //근무시간이 8시간을 초과
            // hours = hours - 8;
            // pay = rate * 8 + hours * (int)(rate * 1.5);

            pay = rate * 8 + (int)(rate * (hours - 8) * 1.5);

        }

        System.out.printf("받는 임금은 %d원 입니다.", pay);
    }
}
// 8시간 근무시 78400
// 9시간 근무시 78400
// 초과수당 1시간당 14700

// 
