package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "grape", "melon", " watermelon", "banana");

        Stream<String> stream = fruits.stream();

        stream
                .map(str -> str.toUpperCase())
                .peek(str -> System.out.println("확인용 : " + str)) // 중간연산이며 확인용? 중간연산이기에 최종연산 전에는 출력되지 않음.
                .forEach(str -> System.out.println(str));

        System.out.println("\n");

        fruits.stream()
                .map(String::toUpperCase)
                .peek(str -> System.out.println("확인용 : " + str)) // 중간연산이며 확인용? 중간연산이기에 최종연산 전에는 출력되지 않음.
                .forEach(System.out::println);

        System.out.println("\n");

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        stream2.map(f -> f.getName())
                .filter(f -> f.indexOf(".") > -1)
                .map(f -> f.substring(f.lastIndexOf(".") + 1))
                .distinct()
                .peek(f -> System.out.println("    peek : " + f))
                .forEach(f -> System.out.println(f));

        System.out.println("\n");

        fruits.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        fruits.stream().skip(2).limit(2).forEach(System.out::println);

        // 스트림 연결하기 Stream.concat(같은 타입의 스크림 1, 2);
        String[] arr1 = { "123", "456", "789" };
        String[] arr2 = { "abc", "def", "hij" };

        // 배열 => 스트림 변환 방법
        // 1. Arrays 사용
        Stream<String> stream3 = Arrays.stream(arr1);
        // 2. Stream.of 활용
        Stream<String> stream4 = Stream.of(arr2);

        Stream<String> newStream = Stream.concat(stream3, stream4);

    }
}
