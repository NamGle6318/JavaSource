package oop;

public class MiniCalcEx {
    public static void main(String[] args) {
        // MiniCalc.k = 0; static 형태라 따로 new 안해도 됨
        // 클래스메서드이기 때문에 객체 생성없이 클래스 이름. 으로 호출가능

        // 클래스 메서드, 클래스 변수 는 클래스이름. 만하면 어느 파일에서든 불러올수 있으니(프로젝트 내) 함부로 만들면 안 좋을 듯함
        MiniCalc.print();

        MiniCalc calc = new MiniCalc();

        // calc.a = 1;

        calc.execute(); // 인스턴스 메서드이기 때문에 new로 해당 클래스 선언한 이후에야 사용가능
    }
}
