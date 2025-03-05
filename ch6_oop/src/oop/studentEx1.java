package oop;

public class studentEx1 {
    public static void main(String[] args) {
        // student 인스턴스를 생성, 사용
        // 학생한명당 객체 하나 만들기
        // 인스턴트 생성 시 생성자를 사용함.
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("23-71301613", "정현우", 1, 3, "010-1234-5678", "abc123@gmail.com");

        student3.changePhone("010-8765-4321");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
