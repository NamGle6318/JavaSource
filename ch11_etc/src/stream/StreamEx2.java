import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        // 컬렉션 : list, set
        Set<String> set = new HashSet<>();

        // set을 stream으로 변경
        Stream<String> stream = set.stream();

        // 배열
        String[] strArr = { "홍길동", "성춘향", "신철용" };

    }
}
