package api.util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    public static void main(String[] args) {
        // 한 어린이의 키를 2015~2024년 사이에 1년 단위로 입력 받기
        // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
        // 입력 예시 : 120 122 125 130 139 160 169 173 176
        // 출력 예시 : 2020년

        ArrayList<Integer> heights = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);
        // 연도 리스트에 키 입력
        for (int i = 0; i < (2024 - 2015) + 1; i++) {
            if (st.hasMoreTokens()) {
                heights.add(Integer.parseInt(st.nextToken()));
            }
        }

        // 키 성장율이 제일 높은 년도 = 현재 년도 - 지난 년도의 값이 제일 큰 거
        int heightest = heights.get(1) - heights.get(0);
        int year = 0;
        for (int i = 0; i < heights.size() - 1; i++) {
            if (heightest < heights.get(i + 1) - heights.get(i)) {
                heightest = heights.get(i + 1);
                year = i;
            }
        }
        System.out.println(year + 2015);

        sc.close();
    }
}
