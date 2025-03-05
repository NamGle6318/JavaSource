package oop;

public class MiniCalc {

    // 같은 클래스 내에서 다른 메서드 호출 가능
    // new 선언을 하지 않아도 됨

    // 메서드 종류 :
    // 1. 인스턴스 메서드 : 클래스 영역 / 인스턴스가 생성되었을 때 new ㅁㅅㄷ()
    // 2. 클래스 메서드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때

    int plus(int x, int y) { // 두 수를 합한 값
        return x + y;
    }

    double avg(int x, int y) { // 두 수의 평균 값 plus 호출
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() { // 두 수의 평균 출력 avg 호출
        double result = avg(7, 10);
        println("실행 결과 : " + result); // println 호출
    }

    void println(String msg) {
        System.out.println(msg);
    }

    // 클래스 메서드 선언
    static int k;
    int a, b;

    static void print() {
        // plus(x, y); - 스태틱내에서 non 스태틱 호출이 안됨
        // 생성되는 시기가 다름
        // static은 해당 내용이 작성이 완료되면 저장됨
        // non-static은 클래스를 선언해야 저장됨
        // 따라서 static - non-static 순으로 저장됨

        // MiniCalc mini = new MiniCalc();
        // mini.plus(3, 5); 이러면 됨
    }

}
