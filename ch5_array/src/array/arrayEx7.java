package array;

import java.util.Arrays;

// 2차원 배열

public class arrayEx7 {
    public static void main(String[] args) {
        // 배열 abc + num 합친 후 하나의 배열로 생성하기

        char abc[] = { 'A', 'B', 'C', 'D' };
        char num[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        char result[] = new char[abc.length + num.length];

        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);

        System.out.println(Arrays.toString(result));
    }
}
