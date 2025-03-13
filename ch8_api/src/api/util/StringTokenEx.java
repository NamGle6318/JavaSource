package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println(str);
        // split
        System.out.println("String split()" + Arrays.toString(str.split((" "))));

        // 다음 토큰이 있으면 토큰을 출력
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        // StringTokenizer 구분자에 따라서 토큰 분리
        str = "this/is/a/test";
        st = new StringTokenizer(str, "/"); // 구분자 없다면 공백으로 분리

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        // 구분자 복수 지정 "+-*/=()" / 구분자또한 돌려받을건지 여부 정할 수 있음
        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        // 최종 출력
        // 1
        // 김천재
        // 100
        // 100
        // 100
        // --------
        // 2
        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
        st = new StringTokenizer(source, "|"); // 1,김천재,100,100,100
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("--------------------");
        }
        System.out.println();
    }
}
