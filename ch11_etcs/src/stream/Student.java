package ch11_etc.stream;

public class Student {
    private String name;
    private int math;

    public int getMath() {
        return math;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public Student(String name, int math) {
        this.name = name;
        this.math = math;
    }
}
