package op;
//연산자 종류
//  단항연산자 : 음수, 양수, 증감
//  이항연산자 : 산술 연산자, 비교 연산자, 논리 연산자, 대입 연산자 등등
public class SignOperEx1 {
    public static void main(String[] args) {
        
        int x = -100; // 부호 연산자
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        
    }
}
