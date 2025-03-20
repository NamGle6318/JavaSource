package ch11_etc.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "성춘향", "김자바");

        // for (String string : list) {
        // System.out.println(string);
        // }
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
        }
        // Stream
        Stream stream = list.stream();
        // void forEachOrdered(Consumer<? super String> action);
        stream.forEach(s -> System.out.println(s));
        // stream.forEach(s -> System.out.println(s));
        // IllegalStateException: stream has already been operated upon or closed (스트림
        // 닫힘)

        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신철용", 75));
    }
}
