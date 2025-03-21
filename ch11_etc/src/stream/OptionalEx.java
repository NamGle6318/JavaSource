package stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcdef");
        Optional<Integer> optInt = optStr.map(String::length);

        // Optional<T> 타입의 변수의 값을 불러오기
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        // orElse() : 널일경우 다른 값 반환

        int result = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result = " + result);

        // isPresent() / ifPresent()
        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result2 = %d\n", x)); // null -> -1

        OptionalInt optInt1 = OptionalInt.of(0); // Int 값 null = 0
        OptionalInt optInt2 = OptionalInt.empty(); // = noValue
        System.out.println("OptInt1 = " + optInt1.isPresent()); // true = null
        System.out.println("OptInt2 = " + optInt2.isPresent()); // false = not null
        System.out.println(optInt2.getAsInt() + 1);
    }
}
