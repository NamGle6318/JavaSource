package oop;

// 값 복사(primitiveParam) : 출력문 썼을때 그 변수의 값이 나오는 것들
// 주소 복사(refrenceParam) : 출력문 썼을때 주소가 출력되는것들
public class referenceParamEx {

    public static void main(String[] args) {

        int[] x = { 10 };
        System.out.println(" main() : x = " + x[0]);
        change(x); // 주소복사
        System.out.println("After change(x)");
        System.out.println(" main() : x = " + x[0]);
        change2(x[0]);// 값복사
        System.out.println("chang2 이후 main x[0] : " + x[0]);
        System.out.println(x);
        System.out.println(x[0]);

    }

    static void change(int[] x) { // x라는 배열의 주소를 받아옴
        x[0] = 1000;
        System.out.println("change(0) : x =" + x[0]);
    }

    static void change2(int x) { // x[0]의 값을 받아옴
        x = 10;
        System.out.println("change(0) : x =" + x);
    }
}
