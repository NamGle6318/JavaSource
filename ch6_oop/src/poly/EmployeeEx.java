package poly;

public class EmployeeEx {
    public static void main(String[] args) {
        // 다형성 인스턴스 선언 및 멤버변수 초기화
        Employee employee1 = new Employee();
        employee1.setName("홍길동");
        employee1.setPosition("사원");
        // employee1.work();
        doWork(employee1);

        employee1 = new Ceo();
        employee1.setName("김동호");
        employee1.setPosition("대표");
        // employee1.work();
        doWork(employee1);

        employee1 = new PartTime();
        employee1.setName("이민지");
        employee1.setPosition("시간제");
        // employee1.work();
        doWork(employee1);

        employee1 = new Admin();
        employee1.setName("관리자");
        employee1.setPosition("admin");
        // employee1.work();
        doWork(employee1);
    }

    static void doWork(Employee e) { // 다형성 인스턴스를 생성했기 때문에 하나의 통일된 타입만 받아도 참조한 자식 클래스에 따라 여러가지 결과물을 낼 수 있음.
        e.work();
    }
}
