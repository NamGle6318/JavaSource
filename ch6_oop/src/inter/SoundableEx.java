package inter;

interface Soundable { // 소리 형태 인터페이스
    String sound();
}

class Dog implements Soundable { // 소리형태 - 멍멍

    @Override
    public String sound() {
        return "멍멍";
    }

}

class Cat implements Soundable { // 소리형태 - 야옹

    @Override
    public String sound() {
        return "야옹";
    }

}

class soundableEx {

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    static void printSound(Soundable s) { // 소리형태를 출력하는 메서드
        System.out.println(s.sound());
    }
}
