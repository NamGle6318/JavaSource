package exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        // Exception - ClassNotFoundException
        //
        try {
            Class.forName(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // error가 난 부분을 개발자 기준으로 알려줌
        }
    }
}
