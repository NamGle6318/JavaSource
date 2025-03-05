package oop;

// import java.util.Scanner;

public class Student {
    // 멤버 변수(속성&특성), 멤버 메소드(동작&기능), 생성자(?),

    // 속성 : 학생의 학번, 이름, 학년, 반, 전화번호, 이메일 등등
    // 메소드 : 전화번호를 변경, 이메일을 변경, 학년을 변경, 반을 변경

    // 속성
    String stuId = "Null"; // 학번
    String name = "Null"; // 이름
    int grade = 0; // 학년
    int classNumber = 0; // 반
    String phone = "Null"; // 전화번호
    String email = "Null"; // 이메일

    // Scanner scanner = new Scanner(System.in);
    // String inputStr;
    // int inputNum;

    // 기능
    // 메소드 : 리턴타입 메소드명() {}
    // 리턴(반환) 타입 : 기본타입, 객체(대문자로 시작하는 String 등), 배열, void(리턴타입 없음)
    void changePhone(String phone) { // 전화번호 변경(String)
        this.phone = phone;

        // return this.phone; // this. 는 멤버변수, 멤버메서드 앞에만 붙히기
    }

    void changeEmail(String email) { // 이메일 변경(String)
        this.email = email;

        // return " ";
    }

    void changeGrade(int grade) {// 학년변경(int)

        this.grade = grade;

        // return this.grade;
    }

    void changeClassNumber(int classNumber) {// 반 변경(int)
        this.classNumber = classNumber;

        // return this.classNumber;
    }

    @Override
    public String toString() {
        return "student [stuId=" + stuId +
                ", name=" + name +
                ", grade=" + grade +
                ", classNumber=" + classNumber +
                ", phone=" + phone +
                ", email=" + email + "]";
    }

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자를 만들어 줌
    // 클래스명() {} <- default 생성자라고 불림
    // ()안의 개수가 다르기만 하면 동일한 생성자여도 오류가 없다.
    // 나중에 코드 쓸 때 자동완성란에 표기됨

    public Student() {
    }

    // this. = 객체 자신
    // 지역변수 갖고온걸 this.객체자신에 넣어달라

    public Student(String stuId, String name, int grade, int classNumber, String phone, String email) {
        // 생성자의 목적 : 멤버 변수 초기화
        this.name = name;
        this.grade = grade;
        this.classNumber = classNumber;
        this.phone = phone;
        this.email = email;
    }

    public Student(int grade, int classNumber) {
        this.grade = grade;
        this.classNumber = classNumber;
    }
}
