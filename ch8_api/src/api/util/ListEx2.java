package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("바나나");
        list.add("수박");
        list.add("딸기");
        list.add("포도");
        list.add("오렌지");
        list.add("귤");

        System.out.println(list.remove(5));
        System.out.println(list.remove("귤"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s    ", list.get(i));
        }
        System.out.println();
        for (String string : list) {
            System.out.print(string);
            System.out.print("    ");
        }

        System.out.println();

        System.out.println(list.contains("바나나"));

        System.out.println(list.indexOf("포도"));

        // 배열 -> 리스트 변환
        // ArrayList 클래스를 이용해서 변환
        // Arrays : 배열에 필요한 유용한 메소드 제공
        String[] strArr = { "사과, 바나나, 수박, 딸기, 포도" };
        List<String> list2 = Arrays.asList(strArr);

        System.out.println(list2);
        // System.out.println(list2.get(0));
        // list2.add("한라봉"); java.lang.UnsupportedOperationException

        // 배열 -> 리스트 변환 및 수정 가능
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("한라봉");
        System.out.println(list3);

        // 리스트 -> 배열 변환
        Object[] arrs = list3.toArray();

        System.out.println(Arrays.toString(arrs));
        System.out.println((arrs));

    }
}
