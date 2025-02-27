package ch1;

// 변수의 유효범위
// 블럭 안에서 선언된 변수는 선언한 블럭 내에서만 사용 가능하다.

public class scopeEx1 {
    public static void main(String[] args) {
        int a = 100;
        {
            int x = 10;
            System.out.println("x=" + x);
            System.out.println("a=" + a);
           
        }
        // System.out.println(x ,y);
        if(a < 200){
            int sum = 0;
        }
    }

}
