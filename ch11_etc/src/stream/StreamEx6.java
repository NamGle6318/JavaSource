package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);

        // 2의 배수 개수
        long count = stream.filter(i -> i % 2 == 0).count();
        System.out.println("2의 배수의 개수 : " + count);

        System.out.println("");

        // 2의 배수의 평균 구하기
        stream = IntStream.rangeClosed(1, 10);
        OptionalDouble avg = stream.filter(i -> i % 2 == 0).average();
        System.out.println("2의 배수의 평균 : " + avg.getAsDouble());

        System.out.println("");

        // 2의 배수의 최대값
        stream = IntStream.rangeClosed(1, 10);
        OptionalInt maxNum = stream.filter(i -> i % 2 == 0).max();
        System.out.println("2의 배수의 최대값 : " + maxNum.getAsInt());

        System.out.println("");

        // 2의 배수의 최소값
        stream = IntStream.rangeClosed(1, 10);
        OptionalInt minNum = stream.filter(i -> i % 2 == 0).min();
        System.out.println("2의 배수의 최소값 : " + minNum.getAsInt());

        System.out.println("");

        // 2의 배수의 합
        stream = IntStream.rangeClosed(1, 10);
        int sum = stream.filter(i -> i % 2 == 0).sum();
        System.out.println("2의 배수의 총합 : " + sum);

        System.out.println("");
    }
}
