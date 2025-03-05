package oop;

public class Data {
    int x;

    void test() {
        System.out.println("양호");
    }

    public static void main(String[] args) {

        // test() = 실행 안됨. | 한 class 파일내에 있지만 main 메서드는 static 이기 때문에 저장 시점이 test 저장보다
        // 먼저임
        Data data = new Data(); // Data class 를 선언 = 저장이 되었음

        data.test();
    }
}
