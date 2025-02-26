package op;

//float와 double type를 비교연산자를 이용해 비교
//double type이 float type보다 나은 이유

public class CompareEx2 {
    public static void main(String[] args) {
        
        float f1 = 0.1f;
        double d1 = 0.1;
        double d2 = (double)f1;


        //19.17f = 19자리 표현, 소수점은 17자리까지
        System.out.printf("10.0 == 10.0f %b\n", (10.0==10.f));
        System.out.printf("0.1 == 0.1f %b\n", (0.1 == 0.1f));
        System.out.printf("f1 = %19.17f \n", f1);
        System.out.printf("d1 = %19.17f \n", d1);
        System.out.printf("d2 = %19.17f \n", d2);
        System.out.printf("f1 == d1 %b\n", f1 ==d1);
        System.out.printf("d2 = f1 %b\n", d2 == f1);
        System.out.printf("(float)d1 == f1 %b\n", (float)d1 == f1);
        
    }
}
