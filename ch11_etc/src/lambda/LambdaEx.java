package lambda;

public class LambdaEx {
    public static void main(String[] args) {

        // Lambda 3 예제
        Lambda3 lambda3 = (a, b) -> a > b ? a : b;
        System.out.println("max " + lambda3.max(5, 3));
    }
}
