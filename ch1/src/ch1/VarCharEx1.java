package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        //문자 : 글자 1개 , 문자열 : 글자 1개 이상
        //문자 : 'a' '미' ' '
        //문자열 : "a" "미" "abwerasdf" " " 

        //문자
        char ch1 = '기';
        System.out.println(ch1);
        System.out.println("ch1 : " + ch1);

        //문자열
        //인간어 -> 기계어 : 인코딩
        //기계어 -> 인간어 : 디코딩
        //유니코드

        char ch2 = 'a';

        int unicode = ch2; //문자형 변수 ch2의 값을 정수형인 unicode 변수에 대입
        System.out.println("ch2 = " + ch2);
        System.out.printf("ch2 = %c", ch2); //문자형을 정수형으로 변환했더니 문자였던 a가 97로 나옴

        
    }
}
//a = 97
//A = 65 