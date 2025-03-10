package poly;

// instanceof 사용해보기
public class Employee {
    // 멤버 변수 선언
    private String name;
    private String position;

    // 메서드 선언
    public void work() {
        System.out.println(name + " " + position + "이(가) 일합니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
