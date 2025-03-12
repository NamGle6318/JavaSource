package api.object;

public class ObjectEx {
    public static void main(String[] args) {
        // 유용한 클래스들 (Object 클래스)

        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println(object1.equals(object2) ? "같음" : "다름");
        System.out.println(object1 == object2 ? "같음" : "다름");
        System.out.println();

        Value value1 = new Value(10);
        Value value2 = new Value(10);

        System.out.println(value1.equals(value2));
        System.out.println(value1.value == value2.value);
        System.out.println();

        Person p1 = new Person("hong123", "홍길동");
        Person p2 = new Person("hong123", "고길동");

        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");
        System.out.println();

        System.out.println(object1.toString()); // java.lang.Object@24d46ca6
        System.out.println(object2.toString()); // java.lang.Object@4517d9a3
        System.out.println(value1.toString());
        System.out.println(p1.toString());
        System.out.println();
        System.out.println(p2.toString());
    }
}
