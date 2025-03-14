package api.util;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("감");
        set1.add("사과");
        set1.add("바나나");
        set1.add("아보카도");
        set1.add("샤인머스켓");
        set1.add("제주도출신귤");
        set1.add("갈아만들었던배");
        set1.add("사과"); // 중복

        System.out.println("set = " + set1); // [감, 갈아만들었던배, 사과, 아보카도, 바나나, 샤인머스켓, 제주도출신귤]
    }
}
