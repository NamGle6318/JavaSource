package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // int형의 List를 선언
        List<Integer> list = new ArrayList<>(10);

        // List의 값 입력 방식
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(0, 89);
        System.out.println(list);

        // 조회
        // get(index = );
        System.out.println("특정 위치 요소 조회 : " + list.get(3));

        // 제거
        //
        list.remove(5);
        list.remove(Integer.valueOf(89));
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(35)));
        System.out.println(list);
    }
}
