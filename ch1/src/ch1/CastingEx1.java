package ch1;
//형변환(Casting) 작은타입 -> 큰타입은 허용 , 큰 타입에서 작은 타입은 데이터 손실이 발생할 수 있기 때문에 강제 형변환?
//변수 또는 상수의 타입을 다른 타입으로 변환하는 것
public class CastingEx1 {
    public static void main(String[] args) {
        // double d = 85.4;
        // int score = (int)d;
        // System.out.println("d = " + score);


        // int intValue = 10;                     //다른 타입의 값을 같이 계산하면 큰 타입을 따라감
        // double dblValue = 5.5;
        // int result = intValue + (int)dblValue;
        // System.out.printf("result = %d \n", result);

        // float f1 = 9.1234567f;
        // double d1 = 9.1234567;

        // double d2 = f1;

        // double result2 = d1 + f1;

        // int num = 97;
        // char ch1 = (char)num;
        // System.out.println("ch1 = " + ch1);

        char a = 'a';
        int unicode = a;
        System.out.println(unicode);
    }
    
}
//float와 double 