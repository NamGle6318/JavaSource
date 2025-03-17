package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class Worker extends Person {

    public Worker(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class HighStudent extends Student {

    public HighStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Course<T> {
    //
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>(capacity);
    }

    public void add(T t) {
        this.students.add(t);
    }

    public String getName() {
        return name;
    }

    public List<T> getStudents() {
        return students;
    }

}

class CourseEx {
    public static void main(String[] args) {
        // 일반인 과정 이름 리스트
        Course<Person> personCourse = new Course("일반인과정", 20);
        personCourse.add(new Person("홍길동1"));
        personCourse.add(new Worker("홍길동2"));
        personCourse.add(new Student("홍길동3"));
        personCourse.add(new HighStudent("홍길동4"));
        registerCourse(personCourse);

        // 직장인 과정 이름 리스트
        Course<Worker> workerCourse = new Course("직장인과정", 10);
        personCourse.add(new Worker("홍길동5"));
        registerCourse(workerCourse);
        registerCourseWorker(workerCourse);
        // registerCourseStudents(workerCourse); 학생 클래스만 허용

        // 학생 과정 이름 리스트
        Course<Student> StudentCourse = new Course("학생과정", 5);
        personCourse.add(new Student("홍길동6"));
        registerCourse(StudentCourse);
        registerCourseStudents(StudentCourse);
        Course<HighStudent> highCourse = new Course("고등학생과정", 5);
        personCourse.add(new HighStudent("홍길동7"));
    }

    // 등록
    static void registerCourse(Course<?> course) {
        // 모든 과정 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());

    }

    static void registerCourseStudents(Course<? extends Student> course) {
        // Student, HighStudent만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());

    }

    static void registerCourseWorker(Course<? super Worker> course) {
        // Worker, Person만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());

    }
}