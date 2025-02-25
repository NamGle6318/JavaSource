package ch1;
//shift+alt+아래 방향키 : 현재 줄 복사
// 클래스명은 무조건 대문자 시작

public class VarByteEx1 {
    public static void main(String[] args){ // "main(String[] args)" = 메소드라고 불리는 형태
    //변수 = 어떤 지정한 값을 메모리속에서 바로 찾아내기 위해 이름을 지어줌
    //변수의 기본타입 : 정수, 실수, 문자, 불린
    //변수선언 : 변수의 기본 타입 변수값 = 값;
    //정수형 : byte short "int" "long"
    //실수형 : char
    //문자형 : float double
    //불린형 : boolean

    //변수명을 지을때 
    //단어가 2개 이상일 경우 : 앞 단어의 시작은 소문자, 뒷 단어의 시작은 대문자로 한다.
    //예외로 max-speed : 데이터베이스 필드명에서 쓰임

    byte age = 15, maxSpeed = 100;
    // System.out.println(age);        
    // System.out.println(maxSpeed); print"ln" : "ln" 줄바꿈

    //+ = (산술연산 / 연결[문자])
    System.out.println(age + ", " + maxSpeed); // (문자 + 변수) (연결)
    System.out.println("나이 : " + age + " " + "최고속도 : " + maxSpeed);
    System.out.printf("나이 : %d \nage : %d \n 최고속도 : %d", age, maxSpeed);
    System.out.println(age + maxSpeed); // 변수끼리의 합 (산술연산)

    }
}
//선언하는 타입별 공간 할당 (1byte가 기준)
//1byte = 8bit
//byte(1byte) short(2byte) int(4byte) long(8byte)
//char(2byte)
//float(4byte) double(8byte)

//1byte 의 숫자 표현의 최대치 : 2^8 = 256, 음수부터 표현시 -128 ~ 127

//상수 : 값이 정해지면 변수마냥 바꿀 수 없음
//타입 상수명 = 값; final int MAX_VALUE = 0100;
//자바에서 상수 작성시 변수를 대문자로 쓴다.