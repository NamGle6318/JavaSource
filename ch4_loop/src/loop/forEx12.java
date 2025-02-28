package loop;

// 중첩 for문

// 4x + 5y = 60에 만족하는 변수를 찾는 프로그램
// x, y는 10이하의 자연수

//printf를 삼항 연산자로 출력할때
public class forEx12 {
    public static void main(String[] args) {

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                System.out.print(4 * x + 5 * y == 60 ? "x :" + x + " y : " + y + "\n" : "");
                // System.out.prinf((4 * x + 5 * y == 60) ? "x = %d, y = %d" : ""); %d 어케 넣음?
            }
        }
    }
}
