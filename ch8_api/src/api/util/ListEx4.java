package api.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("사과");
        list.add("바나나");
        list.add("수박");
        list.add("딸기");
        list.add("포도");
        list.add("오렌지");
        list.add("귤");

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();

        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.indexOf("포도"));
        list.add(1, "피자");
        System.out.println(list);

    }
}
