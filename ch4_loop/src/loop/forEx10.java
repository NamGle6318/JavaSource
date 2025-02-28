package loop;

// 중첩 for문

//     *
//    **
//   ***
//  ****
// ***** 출력

// 1줄에 문자 5개가 있는 5줄을 출력
// 문자는 공백or 별로 출력
// 별을 역삼각형 모양으로 출력
public class forEx10 {
    public static void main(String[] args) {
        // int space = 4;
        // int star = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= space + 1; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= star; k++) {
        // System.out.print("*");
        // }
        // space--;
        // star++;
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }
                System.out.print(j > i ? " " : "*");
            }
            System.out.println();
        }
    }
}
