package loop;

// 중첩 for문

//구구단 2단~9단까지 출력

//1~9까지 증가하는 단, 곱

public class forEx11 {
    public static void main(String[] args) {
        // for (int dan = 2; dan <= 9; dan++) {
        // for (int gop = 1; gop < 9; gop++) {
        // System.out.printf("%d * %d = %d\n", dan, gop, dan * gop);
        // }
        // System.out.println();
        // }

        for (int dan = 2; dan <= 9; dan++) {
            for (int gop = 1; gop <= 9; gop++) {
                System.out.printf("%d * %d = %d \t", dan, gop, dan * gop);
            }
            System.out.println();
        }
    }
}
