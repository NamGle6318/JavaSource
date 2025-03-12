package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세요";
        // 문자열의 길이 확인 : length()
        System.out.println("str의 문자열 길이 :" + str.length());

        // 문자열의 일부를 char type으로 변환 : charAt(index)
        System.out.println("str의 문자열의 4번째 글자 : " + str.charAt(4));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // 문자열을 한글자씩 char[]에 담기 : toCharArray()
        char[] result = str.toCharArray();
        System.out.println(Arrays.toString(result));

        // 주어진 문자가 해당 문자열에 존재하는지 여부 확인 : indexOf()
        // 존재할 경우 위치를 번호로 반환
        // 존재하지 않을 경우 -1을 반환
        // indexOf

        System.out.println(str.indexOf("하", 4));

        System.out.println("" + str.indexOf("하세"));

        String subject = "자바의 정석";

        // subject의 문자열 내에 "자바"의 포함 유무에 따라 내용 출력
        System.out.println(subject.indexOf("자바") != -1 ? "자바와 관련있는 책입니다." : "자바와 관련없는 책입니다.");

        // 해당 문자열내에 주어진 문자열이 있는지 여부에 따라 boolean 값으로 반환 : contains()
        if (subject.contains("자바")) {
            System.out.println("자바와 관련있는 책입니다.");
        } else
            System.out.println("자바와 관련없는 책입니다.");

        // lastIndexOf()
        // indexOf를 끝에서부터 시작함.
        System.out.println(str.lastIndexOf("하"));
        String str2 = "java.lang.String";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".", 5));
        System.out.println(str2.lastIndexOf("."));
    }
}
