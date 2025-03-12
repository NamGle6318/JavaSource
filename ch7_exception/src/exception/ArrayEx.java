package exception;

public class ArrayEx {
    // RuntimeException - ArrayIndexOutOfBoundsException
    public static void main(String[] args) {
        int[] arr = new int[2];

        // try {
        // System.out.println(arr[2]); // arr[2] ArrayIndexOutOfBoundsException 발생
        // // 중단
        // int num = 100 / 0; // AritmeticException
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열 인덱스를 확인해 주세요.");
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없습니다.");
        // }

        // try {
        // System.out.println(arr[0]); // arr[2] ArrayIndexOutOfBoundsException 발생
        // // 중단
        // int num = 100 / 0; // AritmeticException
        // } catch (Exception e) {
        // System.out.println("오류");
        // }

        try {
            System.out.println(arr[0]); // arr[2] ArrayIndexOutOfBoundsException 발생
            // 중단
            int num = 100 / 0; // AritmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // | : 멀티 catch 기호
            System.out.println("오류");
        

    }
}
