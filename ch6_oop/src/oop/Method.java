package oop;

//리턴 타입이 void가 아니면 무조건 반환해야하는 값이 존재해야함. (return)
//타입에 맞게 리턴을 내보내야함
// 메서드 선언후 반환하는 리턴의 개수는 1개뿐임
public class Method {
    int method1(int sum) {
        sum = 15;
        return sum;
    }

    String method2() {
        // 객체 타입(대문자 시작)의 메서드들은 리턴에 null 을 보내도됨
        String hi = new String("Hello!");
        return hi;
        // return null;
    }

    double method3() {

        return 0.1;
    }

    boolean method4() {

        return true;
    }

    char method5() {

        return '1';
    }

    void method6(String name) {

        System.out.println(name);
        // 반환값없이 그냥 명시만
        return;
    }

    // 매개변수가 있는 메서드
    int add(int x, int y) {

        return x + y;
    }

    // 리턴값만 타입이 같으면 매게변수는 어떤 타입을 받아도 상관없음
    int ad2(int x, float y) {

        return (int) (x + y);
    }

    void print(String name, String id) {
        System.out.println(name + ": " + id);

        return;
    }

    int[] arr(int[] arr1) {

        arr1[0] = 123;
        return arr1;
    }

    int[][] arr2(int[][] arr2) {

        return arr2;
    }

    // 조건문을 통한 선택적인 리턴만 하는건 안됨. 어떠한 방식으로든 반환은 되야함
    int question(int x) {
        if (x == 1)
            return 0;
        else
            return 1;

    }
}
