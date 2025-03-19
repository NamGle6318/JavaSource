package oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person2 p2 = new Person2();

        p1.setName("홍길동");
        p1.setPno("112");
        p1.setTel("010-1121-2211");

        p2.setPno(null);

        System.out.println(p1);
        Person2 person2 = Person2.builder() // private 걸어도 세팅이 가능함
                .pno("4567")
                .name("상식이")
                .tel("010")
                .build();

        System.out.println(person2);
    }
}
