package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {

        // 숫자를 전달인자로 받아 출력하기
        Consumer<Integer> consumer = (i) -> System.out.println(i); // void accept(T t)
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

    }

}
