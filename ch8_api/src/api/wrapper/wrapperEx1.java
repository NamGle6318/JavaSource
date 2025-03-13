package api.wrapper;

public class wrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10; // 객체
        int a = 10; // 기본형
        Long l = 10L;
        Float f = 10.0f;
        Character c = 'c';
        Boolean b = true;

        System.out.println(i.parseInt("78") + 2); // 숫자화
        System.out.println(i.toString(88) + 2); // 문자화
        System.out.println(i.max(1, 10));
        System.out.println(i.min(1, 10));

    }
}
