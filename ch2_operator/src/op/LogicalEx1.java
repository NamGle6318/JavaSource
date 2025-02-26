package op;

//논리 연산자 ( and , or , not : && , || , ! )
//결과값은 true&false

//ex ) x는 10보다 크고 20보다 작다 : x > 10 && x < 20
//ex ) y는 2의 배수 또는 3의 배수이다 : y % 2 == 0 || y % 3 == 0
//ex ) y는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다 : )y % 2 == 0 || y % 3 == 0) &&  y % 6 != 0

public class LogicalEx1 {
public static void main(String[] args) {

        int x = 0;
        char ch = ' ';
        
        x = 15;
        System.out.printf("x = %2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20); // x = 15, 10 < x and x < 20 = bool
        
        x = 6;
        System.out.printf("x = %2d, x %% 2==0 || x %% 3==0 %% x %% 6!=0 = %b\n", x, (x % 2 == 0 || x % 3 == 0) && x%6!=0); // x = 6, x and 2==0 or x and 3==0 and 6 != 0 = bool

        ch = '1';
        System.out.printf("ch = %c, '0' <= ch && ch <= '9' = %b\n", ch, ('0' <= ch && ch <='9')); // ch = '1' , '0' <= ch and ch <= 9 = bool
        
        ch = 'a'; 
        System.out.printf("ch = %c, 'a' <= ch && ch <= 'z' = %b\n", ch, ('a' <= ch && ch <='z')); // ch = 'A' , 'A' <= ch and ch <= 'Z' = bool
        
        ch = 'A'; 
        System.out.printf("ch = %c, 'A' <= ch && ch <= 'Z' = %b\n", ch, ('A' <= ch && ch <='Z')); // ch = 'A' , 'A' <= ch and ch <= 'Z' = bool
        
        ch = 'q';
        System.out.printf("ch = %c, 'q' <= ch || ch <= 'Q' = %b\n", ch, (ch == 'q' || ch == 'Q')); // ch = 'q' , 'q' <= ch and ch <= 'Q' = bool

    }    
}


//번외 casting 

//1. 출력하면서 char type을 %d에 담으려고 함
//2. 서로 다른 type의 계산식을 실행하는 경우는 계산하는 과정에서 컴퓨터가 서로 다른 두 type을 자동으려 Casting 해주는 것
//3. 1.번의 경우는 계산이 아니라 단순 출력이기 때문에 type이 Casting 되지 않음.

// 또한 자동 Casting은 컴퓨터가 기본 형을 인지하고 있기 때문에 알아서 해주는거지 형식상으로는 불가능함

// char a, b = ' ';
// a = '0';
// b = '9';
// //문자형을 출력할때 %d에 넣으려고 함. 
//     System.out.printf("'0' = %d , '9' = %d\n", a, b);