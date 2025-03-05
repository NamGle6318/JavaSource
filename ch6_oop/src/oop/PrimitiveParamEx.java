package oop;

public class PrimitiveParamEx {

    public static void main(String[] args) { // = main 메서드

        // change(); // = 인스턴스 메서드이기 때문에 new를 통해 해당 클래스를 선언한 이후에 사용할 수 있음
        // 또한 main 메서드는 static 메서드(클래스 메서드)이기 때문에 change()를 사용하지 못하기도 함.
        // static data가 인스턴스 보다 먼저 저장되기 때문에
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();

        // 해당 프로그램을 작성한 이유
        // Date b = new Date(); // 해당 인스턴스 메서드를 불러오는 코드는 오류를 발생함
        // static main 메서드는 Date 인스턴스 메서드보다 먼저 저장이 됨
        // 위에서 Date 메서드는 아직 저장이 되지 않았기에
        Data d = new Data();
        d.x = 100; // d.x = 100
        System.out.println("main() : x =" + d.x);
        change(d.x); // d.x를 change()함
        // 그러나 chage()내에서는 int x라는 새로운 지역변수의 값에 덧씌워지는 것뿐임
        System.out.println("After change() ");
        System.out.println(d.x);
        change2(d);
        System.out.println(d.x);
    }

    static void change(int x) { // 해당 메서드는 static메서드라 main 메서드 내에서 사용해도 이상 무
        x = 10000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data d) { // d.x 의 값을 바꾸는 방법 지역변수를 선언하는게 아닌 해당 메서드를 가져오기
        // Data d 는 Data라는 메서드를 아예 들고 온거임
        // d = 10000; = Data d라는 변수를 선언한게 아니기에 실행되지 않음
        d.x = 10000;
    }

}
