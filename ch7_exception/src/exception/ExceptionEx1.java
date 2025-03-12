package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        // RuntimeException-ArtimeticException
        // try catch

        int number = 100;
        int result = 0;

        try {
            for (int i = 0; i < 20; i++) {
                result = number / (int) ((Math.random()) * 10); // 0~9 사이의 숫자
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니닷.");
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}