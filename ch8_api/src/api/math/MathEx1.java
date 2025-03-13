package api.math;

public class MathEx1 {
    public static void main(String[] args) {
        System.out.println(Math.random());

        // 올림, 버림, 반올림

        double val = 90.7552;

        System.out.println("" + Math.ceil(val));
        System.out.println("" + Math.floor(val));
        System.out.println("" + Math.round(val));

        System.out.println(Math.min(val, 98));
        System.out.println(Math.max(val, 98));

    }
}
