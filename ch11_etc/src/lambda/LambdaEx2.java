package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {

        // 숫자를 전달인자로 받아 출력하기
        Consumer<Integer> consumer = (i) -> System.out.println(i); // void accept(T t)
        // Consumer<Integer> consumer = System.out::print; //
        consumer.accept(50);

        // 문자를 전달받아 출력하기
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("a");

        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + " " + str2);
        biConsumer.accept("Hello", "world");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(5);

        ObjDoubleConsumer<String> objDoubleConsumer = (t, value) -> System.out.println(t + "" + value);
        objDoubleConsumer.accept("하이", 50000);

        Supplier<Integer> supplier = () -> (int) ((Math.random() * 6) + 1);
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> (int) ((Math.random() * 6) + 1);
        System.out.println(intSupplier.getAsInt());

        // 전달인자로 받은 문자열의 길이가 0인지 확인, 0인 경우 빈문자열입니다. 출력
        Predicate<String> predicate = (String str) -> str.length() == 0;
        if (predicate.test(""))
            System.out.println("빈 문자열입니다.");

        // 전달인자로 받은 숫자가 짝수인지 확인, 짝수라면 "짝수입니다" 아니면 "홀수입니다."
        Predicate<Integer> predicate2 = (Integer num) -> num % 2 == 0;
        if (predicate2.test(5))
            System.out.println("짝수입니다.");
        else
            System.out.println("홀수입니다.");

        // R : return type
        // 숫자를 문자로 반환
        Function<Integer, String> function = i -> String.valueOf(i);

        System.out.println(function.apply(35));

        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 / num2;
        System.out.println(biFunction.apply(5, 3));

        biFunction = (x, y) -> x % y;
        System.out.println(biFunction.apply(5, 9));
    }

}
