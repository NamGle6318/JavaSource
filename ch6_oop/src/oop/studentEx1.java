package oop;

public class studentEx1 {
    public static void main(String[] args) {
        // student 인스턴스를 생성, 사용
        // 학생한명당 객체 하나 만들기
        // 인스턴트 생성 시 생성자를 사용함.
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("23-71301613", "정현우", 1, 3, "010-1234-5678", "abc123@gmail.com");
        Student student4 = new Student("24-71301613", "정아무개", 1, 3, "010-1324-5768", "def123@gmail.com");

        student3.changePhone("010-8765-4321");

        // ToString 클래스로 확인 = 개발자 확인용
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        // user 확인용
        studentInfo(student3);
        // System.out.println("======================================");
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학번 : " + student3.getStuId());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNumber());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("======================================");
        studentInfo(student4);
        // System.out.println("======================================");
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학번 : " + student4.getStuId());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNumber());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("======================================");
    }

    public static void studentInfo(Student student) {
        System.out.println("======================================");
        System.out.println("이름 : " + student.getName());
        System.out.println("학번 : " + student.getStuId());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNumber());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("======================================");
    }

}
