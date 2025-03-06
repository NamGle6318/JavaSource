package oop;

public class SingletonEx {
    public static void main(String[] args) {

        // Singleton single = new Singleton(); : 생성자가 private라 new로 인스턴스를 불러오질 못함

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체"); //

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체"); // 다른 인스턴스 이므로 다른 객체
    }
}
