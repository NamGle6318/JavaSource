package api.object;

public class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;

            if ((this.id).equals(p.id) && (this.name).equals(p.name)) { // id와 name값을 비교하기 위해 String의 equals()사용
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "id : " + id + "\nname : " + name; // int 타입 value를 String 타입으로 변환 후 반환
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
