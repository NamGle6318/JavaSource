package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) { // void 메서드(args를 입력 받음)

        // method.method1(); Method 클래스를 호출하지 않았기에 사용 불가능
        Method method = new Method();
        int sum = method.ad2(1, 4.9f);

        // 메서드 사용하기 = 메서드 호출
        // 즉 Method 클래스 내의 메서드를 사용하려면 호출을 먼저

        float add = method.add(5, 8);

        System.out.println(method.add(18, 39));

        // void 메서드라 반환값이 없다는걸 인지해야함
        method.method6("하이용");

        int aRr[] = { 1, 2, 3 };
        method.arr(aRr);
        System.out.println(Arrays.toString(aRr));

    }
}
