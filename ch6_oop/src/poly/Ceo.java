package poly;

public class Ceo extends Employee {

    // 메서드 선언
    @Override
    public void work() {
        System.out.println(getName() + " " + getPosition() + "이(가) 업무를 봅니다.");
    }
}

class PartTime extends Employee {

    // 메서드 선언
    @Override
    public void work() {
        System.out.println(getName() + " " + getPosition() + "이(가) 주어진 시간동안 일을 합니다.");
    }
}

class Admin extends Employee {

    // 메서드 선언
    @Override
    public void work() {
        System.out.println(getName() + " " + getPosition() + "이(가) 열심히 일을 합니다.");
    }
}
// Employee - Ceo
// Employee - PartTime
// Employee - Admin