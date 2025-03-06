package oop;

public class Singleton {
    // singleton : 객체를 단 하나만 만들어지게 하는 것 = spring과 연관되는 지식?
    // static 특징을 이용해서 : 인스턴스를 생성한 걸 static 공간에 집어 넣음
    // 불러올땐 new가 아닌 static 공간에 이미 있는 인스턴스를 불러옴
    private static Singleton singleton = new Singleton(); // Singleton 클래스 내에서 인스턴스를 생성인데 static에
    // private을 쓰는 이유는 모르겠다.

    // 생성자인데 private을 곁들인
    // 사용 이유 : new class를 통해 선언하지 못하게 막기
    private Singleton() {

    }

    static Singleton getInstance() {
        return singleton;
    }

}
