package loop;

//for 문을 이용하여 1~10 사이의 수 중에서 짝수만 출력

public class whileEx2 {
    public static void main(String[] args) {
        
        // for문으로 작성했던 프로그램 while문으로 대체
        // for (int i = 1; i < 11; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(i + "   ");
        //     }
        // }
        // System.out.println("\n");

        // for (int i = 2; i < 11; i += 2) {
        //     System.out.print(i + "   ");
        // }
        int i = 1;

        while (i < 11) {
            if ( i % 2 == 0) {
                System.out.println(i + "   ");
            }
            i++;
        }

        i = 2;
        while (i < 11) {
            if (i % 2 ==0) {
                
                System.out.println(i + "   ");
            }
            i += 2;
        }
    }
}
