package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx2 {
    static int sum;

    public static void main(String[] args) {
        // 다양한 컬렉션들을 stream 구조로 변경?

        // 컬렉션 : list, set
        Set<String> set = new HashSet<>();

        // set을 stream으로 변경
        Stream<String> stream = set.stream();

        // 배열
        String[] strArr = { "홍길동", "성춘향", "신철용" };
        Stream<String> stream2 = Arrays.stream(strArr);
        stream2.forEach(name -> System.out.println(name));

        // 디렉토리
        Path path = Paths.get("c:/temp");
        try (Stream<Path> stream3 = Files.list(path);) {
            stream3.forEach(f -> System.out.println(f.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 숫자 범위로부터 스트림 얻기
        // 1~100 까지의 합

        IntStream.rangeClosed(1, 100).forEach(i -> sum += i);
        System.out.println("합계 : " + sum);

        long result = LongStream.rangeClosed(1, 100).sum();
        System.out.println(result);
    }
}
