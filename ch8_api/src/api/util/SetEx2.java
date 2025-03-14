package api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 로또번호
        // 1~45의 숫자 중에서 무작위로 6개의 숫자를 추출

        Set<Integer> lotto = new HashSet<>();
        int lottoNum;

        // 1~45사이 중복되지 않는 무작위 난수 생성
        for (int i = 0; lotto.size() < 6; i++) {
            lottoNum = (int) ((Math.random() * 45 + 1));
            lotto.add(lottoNum);
        }
        // haseSet [3, 37, 21, 38, 7, 30]
        // Set -> List 변경
        System.out.println(lotto);
        List<Integer> list = new ArrayList<>(lotto);

        list.sort(Comparator.reverseOrder());
        System.out.println(list); // 내림차순 : reverseOrder

        list.sort(Comparator.naturalOrder());
        System.out.println(list); // 오름차순 : naturalOreder
    }
}
