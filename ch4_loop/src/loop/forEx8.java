package loop;

// 중첩 for문

//*
//**
//***
//****
//***** 출력

public class forEx8 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
