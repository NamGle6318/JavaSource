package op;

//나머지 연산자 
//나누기 : / , 나머지 : %

public class ArthmeticEx4 {
    public static void main(String[] args) {      
        int x = 10;
        int y = 8;

        System.out.printf("%d를 %d로 나누면\n",x ,y);
        System.out.printf("몫은 %d이고 나머지는 %d입니다.\n", x/y, x%y);
    }    
}