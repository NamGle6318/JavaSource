package op;

// 이항연산자(+ - * %)
//int(4) < float(4) : 숫자의 표현범위가 실수가 더 큼

public class ArthmeticEx1 {
    public static void main(String[] args) {
        int a, b;
        a = 10; b = 4;

        System.out.printf("%d + %d = %d\n ", a, b, a + b);
        System.out.printf("%d - %d = %d\n ", a, b, a - b);
        System.out.printf("%d * %d = %d\n ", a, b, a * b);
        System.out.printf("%d / %d = %d\n ", a, b, a / b);
        System.out.printf("%d / %.0f = %.1f\n ", a, (float)b, a / (float)b);
        
    }
    
}
