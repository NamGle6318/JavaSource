package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        // treeSet
        Set<Integer> lotto = new TreeSet<>();

        int lottoNum;

        // 1~45사이 중복되지 않는 무작위 난수 생성
        for (int i = 0; lotto.size() < 6; i++) {
            lottoNum = (int) ((Math.random() * 45 + 1));
            lotto.add(lottoNum);
        }
        // TreeSet [7, 14, 16, 18, 27, 38]
        System.out.println(lotto);
    }
}
