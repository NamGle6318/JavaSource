package exception;

public class throwEx {
    public static void main(String[] args) {

        try {
            throw new Exception("고의 발생");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
