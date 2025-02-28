package loop;

// break : break가 포함된 반복문(1개)을 벗어남

// sum값이 100보다 큰경우 멈추는 프로그램

public class breakEx1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        while (true) {
            if (sum > 100)
                break;

            i++;
            sum += i;
        }
        System.out.printf("sum : %d , i : %d", sum, i);
    }
}
