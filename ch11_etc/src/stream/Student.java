package stream;

public class Student {
    private String name;
    private int math;

    public int getMath() {
        return math;
    }

    public String getName() {
        return name;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
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
