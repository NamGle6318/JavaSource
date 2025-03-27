package exception;

public class NullEx1 {
    public static void main(String[] args) {
        // RuntimeException - NullPointerException

        String str = null;

        System.out.println(str);
        try {
            System.out.println(str.length());

        } catch (Exception e) {
            System.out.println("실패");
        }

        System.out.println("실행");
    }
}
