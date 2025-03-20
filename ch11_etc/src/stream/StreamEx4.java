package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//forEach(n -> System.out.println(n)); // 리스트 출력
//forEach(Consumer<? super T> action);
//forEach(String sout(n));
//

public class StreamEx4 {
    public static void main(String[] args) {
        // 중복된 이름을 제거 후 출력 1. set 변환 | 2. stream
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신민철", "홍길동");
        // Set<String> set = new HashSet(names);
        // System.out.println(set);

        names.stream() // stream 구조
                .distinct() // 중복 제거
                .forEach(n -> System.out.println(n)); // 리스트 출력

        System.out.println("\n");
        // 성이 신씨인 사람만 출력 -
        names.stream()
                .filter(name -> name.startsWith("신")) // 신으로 시작하는 사람을 판별
                .forEach(i -> System.out.println(i)); // 필터링된 값만 출력

        System.out.println("\n");

        // 중복 제거후 성이 신씨인 사람만 출력
        names.stream()
                .distinct() // 중복된 값 제거
                .filter(name -> name.startsWith("신")) // 성이 신씨인 사람 판별
                .forEach(i -> System.out.println(i)); // 판별된 값 출력

        System.out.println("\n");
        // fruits를 대문자로 변경한 후에 출력
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        for (String string : fruits) {
            System.out.println(string.toUpperCase());
        }
        // 대문자로 변경한걸 새로운 리스트로 생성
        List<String> fruits2 = new ArrayList<>();

        for (String string : fruits) {
            fruits2.add(string.toUpperCase());
        }
        System.out.println(fruits2);

        // stream 이용
        // map : Stream.map(Function<? super String,? extends R> mapper) : Stream<R>
        // Function(T R)
        List<String> fruits3 = fruits.stream() // List -> Stream
                .map((after) -> after.toUpperCase()) // 소문자 -> 대문자로 변환해서 반환
                .collect(Collectors.toList()); // 매핑한 값들을 새로운 list로 담기

        // Stream 생성
        // 1. IntStream.range(0, 0);
        // 2. Stream.of(T... valuse) : 가변
        // 2. Stream.of(T t)
        Stream<File> stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        // 파일의 확장자를 출력(중복된 확장자는 제외)
        Set<String> extSet = new HashSet<>(); // 중복제거를 위한 Set 생성
        stream.forEach(f -> { // stream 내 file들 for문
            int pos = f.getName().indexOf("."); // pos에 File들의 이름을 대입
            if (pos != -1) { // File 내 .이 존재할경우 확장자만 잘라서 Set에 대입
                String ext = f.getName().substring(pos + 1);
                extSet.add(ext);
            }
        });
        System.out.println(extSet);

        // Stream
        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        stream2.map(f -> f.getName()) // File의 이름들을 추출
                .filter(f -> f.indexOf(".") > -1) // 추출한 이름 내에 "." 이 있는 것들만 반환
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // 확장자명 추출
                .distinct() // 중복되는 확장자명 제외
                .forEach(f -> System.out.println(f)); // 출력

    }
}
