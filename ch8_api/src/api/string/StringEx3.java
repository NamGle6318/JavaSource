package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        // 문자열을 연결 : +
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1 + str2;
        System.out.println(str1 + str2);
        System.out.println(str3);

        // 문자열을 연결 : concat()
        str2 = "안녕하세요 ";
        str2 = str2.concat("반갑습니다.");
        System.out.println(str2);

        // 시작 위치에 주어진 문자열이 존재여부에 따라 boolean 값으로 반환 : endsWith(), startsWith()
        System.out.println(str2.endsWith("."));

        // endsWith()를 사용해 해당 파일의 확장자를 확인하는 예제
        String file = "text.txt";
        System.out.printf((file.endsWith("img")) ? "%s는 이미지 파일입니다." : "%s는 이미지 파일이 아닙니다.", file);
        System.out.println("\n");

        // 문자열의 일부 내용을 변경한 값을 새로운 문자열로 반환 : replace()
        // 기존에 있던 문자열 원본은 변하지 않는다.
        str2 = "안녕하세요, 반갑습니다.";
        str2 = str2.replace("안녕하세요", "반값습니다");
        System.out.println(str2.replace("안녕하세요", "반값습니다"));
        System.out.println(str2);

        // replace()와 동일하나 정규식 패턴을 사용할 수 있다고 함 : replaceAll()
        // 괄호치고 안에 내용물 적으면 그거에 맞는걸 바꿈
        str2 = "안이안이안이안이안이";
        System.out.println(str2.replace("안", "아"));
        str2 = "나는 영어를 쓰면 안돼 I can't speaking english";
        System.out.println(str2.replaceAll("[A-z]", "X"));

        // 처음꺼만 바뀜 : replaceFirst()
        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("ll", "LL"));

        // 특정 위치의 문자열을 얻어냄 자르는 시작부분과 끝부분을 정할 수 있음: substring()
        str2 = "java.lang.Object";
        System.out.println(str2.substring(10, 16));
        System.out.println();

        // 문자열에 특정 기호를 기준으로 잘라냄 : split
        str2 = "dog,cat,pizza";
        System.out.println(Arrays.toString(str2.split(",")));
        String[] arr = str2.split(",", 1);

        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자& 소문자로 변경하기 : toLower&toUpperCase()
        str2 = "HELLO";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        // 공백을 없애줌. 대신 앞에만: trim()
        // ex trim(" 안녕") == "안녕" -> true
        str2 = "   안녕하세요   ";
        if (str2.trim().equals("안녕하세요")) {
            System.out.println("맞다");
        } else {
            System.out.println("아니다");
        }

        // 매개변수의 타입을 String으로 변환 시켜줌 : String.valueOf()
        int i = 5;
        String str4 = String.valueOf(i);
        System.out.println(str4);
    }
}
