package exception;

public class NullEx1 {
    public static void main(String[] args) {
        // RuntimeException - NullPointerException

        String[] str = new String[5];

        System.out.println(str);
        System.out.println(str[0].length());
    }
}
