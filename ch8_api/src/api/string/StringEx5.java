package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수: " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수: " + count("12345", "AB"));
    }

    // 문자열에 어떤 문자가 들어있는 개수를 반환
    public static int count(String src, String target) {
        int i = 0;
        int count = 0;
        while (src.indexOf(target, i) != -1) {
            i = src.indexOf(target, i);
            i += target.length();
            count++;
        }

        return count;
    }
}
