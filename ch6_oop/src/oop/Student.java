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
    // void changePhone() {
    // inputStr = scanner.nextLine();
    // System.out.println("입력하세요.");
    // phone = inputStr;
    // }

    // void changeEmail() {
    // inputStr = scanner.nextLine();
    // System.out.println("입력하세요.");
    // email = inputStr;
    // }

    // void changeGrade() {
    // inputNum = scanner.nextInt();
    // System.out.println("입력하세요.");
    // grade = inputNum;
    // }

    // void changeClassNumber() {
    // inputNum = scanner.nextInt();
    // System.out.println("입력하세요.");
    // classNumber = inputNum;
    // }

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
