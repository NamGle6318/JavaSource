package oop;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int[] t = { 1, 2, 3, 4, 5 };

        System.out.println(math.add(8, 8, 8));
        System.out.println(math.add(8, 8));
        System.out.println(math.add(15, 8L));

        System.out.println(math.add(t));
    }
}
