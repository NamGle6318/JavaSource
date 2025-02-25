package ch1;
//실수형 float double
//기본적으로 소수점의 숫자가 나오면 프로그램은 double 로 인식함
//float(4b) = double(8b); 
//float = 값 끝에 f를 붙히자

//double 타입도 d를 붙힐 수 있음
//float와 double 두 형태를 만든 이유? 어짜피 double 쓰면 되는거 아닌가? 

public class VarFloatEx1 {
    public static void main(String[] args) {
        float score1 = 90.14f;
        
        double score2 = 98.5d;
        
        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        System.out.printf("score2 =%.1f ", score2);
    }
    
}
