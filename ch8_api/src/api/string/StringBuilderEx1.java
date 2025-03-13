package api.string;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        str1 += "반갑습니다"; // str1 재생성
        str1 += "저는 홍길동입니다"; // str1 재생성

        System.out.println(str1);
        // String은 원본 문자열을 변경 불가능하기 때문에
        // 변경할 때 마다 기존 메모리를 해제후 재생성을 한다.
        // 그래서 append 불가능

        StringBuffer str2 = new StringBuffer("안녕");
        System.out.println(str2);
        System.out.println(str2);

        String str10 = new String("Hello");
        String str11 = new String("Hello");
        System.out.println(str10.equals(str11));

        // StringBuffer의 equals는 오버라이딩 되어 있지 않아서 주소비교가 된다.
        StringBuilder str21 = new StringBuilder("안녕");

        System.out.println(str21.equals(str2));
        System.out.println(str21);
        System.out.println(str2);

        String obj1 = str21.toString();
        String obj2 = str2.toString();

        System.out.println(obj1.equals(obj2));
        String obj3 = new String(str21);

        // String str21Str = new String(str21);
        // 문자열을 거꾸로 출력
        StringBuffer hong = new StringBuffer("토마토는 거꾸로 말해도 토마토");
        str2.append("김치국김치국");
        System.out.println(str2.reverse());
        StringBuffer str101 = new StringBuffer(str1);
        System.out.println(str101.reverse());
        for (int i = hong.length() - 1; i >= 0; i--) {
            System.out.print(hong.charAt(i)); // 문자열의 index 값에 대한 문자를 출력
        }
        System.out.println();

        System.out.println(str101);
        System.out.println(str101.insert(0, str101));
        System.out.println(str101.delete(0, 1));

        str101.replace(0, str101.length(), "초기화");
        System.out.println(str101);

    }
}
