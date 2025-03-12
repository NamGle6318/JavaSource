package api.string;

public class StringEx1 {
    public static void main(String[] args) {

        // 문자열 선언 방법
        String str1 = new String("안녕하세요"); // 인스턴스 생성
        String str2 = "안녕하세요";
        String str3 = "안녕하세요";
        String str4 = new String("안녕하세요");

        char[] charr = { 'H', 'e', 'l', 'l', 'o', '!' };
        String str5 = new String(charr); // char type의 배열을 문자열로 이어줌
        System.out.println(str5 + "");

        // 참조값 비교
        System.out.println(str2 == str3 ? "str2 == str3" : "str2 != str3"); // str2 == str3
        System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2"); // str1 != str2
        System.out.println(str1 == str4 ? "str1 == str4" : "str1 != str4"); // str1 != str4

        // 문자열 비교
        System.out.println(str1.equals(str2) ? "str1 == str2" : "str1 != str2");

        // 빈 문자열 할당
        str1 = ""; // != null
        str2 = null;
        System.out.println(str1.length()); // 0
        // System.out.println(str2.length()); // NPE
    }
}
